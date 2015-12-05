package org.sayem.pages;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage<T extends BasePage<?>> extends BasePage<T> {

    private final ThirdPage<SecondPage<T>> thirdPage;

    protected SecondPage(Page page) {
        super(page);
        this.thirdPage = new ThirdPage<>(this);
    }

    public ThirdPage<SecondPage<T>> second(){
        System.out.println("second.....");
        return this.thirdPage;
    }
}
