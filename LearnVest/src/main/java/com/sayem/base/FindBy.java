package com.sayem.base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public final class FindBy {

    /*
    Sometime we need more logic to find the elements other than By.id(), By.className(), etc…
    For example finding all the elements using id and class name or tagName and xpath etc… or we need to find any one of the id/class/xpath …
    FindBy can help you to do this.

    This idea came to me when IDetectable was going thru the pages factorymethod source code (ByChained), IDetectable found something useful class.

    Look at the following FindBy class, which extends the functionality of existing By classes.
     */

    private FindBy() {
    }

    /**
     * By class to find any elements which has id or class name
     * @param idOrClass id or class name of an elements
     * @return by instance
     */
    public static By idOrClassName(String idOrClass) {
        return new ByAny(By.id(idOrClass), By.className(idOrClass));
    }

    /**
     * By class to find any one of the elements which has the given by.
     * Stops, after finding the first elements present.
     * @param by multiple by instances
     * @return by instance
     */
    public static By any(By... by) {
        return new ByAny(by);
    }


    /**
     * By class to find all the elements for given bys.
     * @param by multiple by instances
     * @return by instance
     */
    public static By all(By... by) {
        return new ByAll(by);
    }

    private static class ByAll extends ByAny{
        public ByAll(By... bys) {
            super(bys);
        }

        @Override
        public List<WebElement> findElements(SearchContext context) {
            if (bys.length == 0) {
                return new ArrayList<WebElement>();
            }

            List<WebElement> newElems = new ArrayList<WebElement>();
            for (By by : bys) {
                newElems.addAll(by.findElements(context));
            }

            return newElems;
        }
    }

    private static class ByAny extends By {

        protected final By[] bys;

        protected String getName() {return  "By.any";}

        public ByAny(By... bys) {
            this.bys = bys;
        }

        @Override
        public WebElement findElement(SearchContext context) {
            List<WebElement> elements = findElements(context);
            if (elements.isEmpty())
                throw new NoSuchElementException("Cannot locate an elements using " + toString());
            return elements.get(0);
        }

        @Override
        public List<WebElement> findElements(SearchContext context) {
            if (bys.length == 0) {
                return new ArrayList<WebElement>();
            }

            List<WebElement> newElems = new ArrayList<WebElement>();
            for (By by : bys) {
                newElems.addAll(by.findElements(context));
                if ( !newElems.isEmpty()){
                    //Stop the loop and return the value
                    return newElems;
                }
            }

            return newElems;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(getName() + "(");
            stringBuilder.append("{");

            boolean first = true;
            for (By by : bys) {
                stringBuilder.append((first ? "" : ",")).append(by);
                first = false;
            }
            stringBuilder.append("})");
            return stringBuilder.toString();
        }
    }
}