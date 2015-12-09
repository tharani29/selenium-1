package org.sayem.pages;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage<T extends Page<?>> extends Page<T> {

    private final ThirdPage<SecondPage<T>> thirdPage;

    protected SecondPage(Page page, T parent) {
        super(page, parent);
        this.thirdPage = new ThirdPage<>(this, this);
    }

    public ThirdPage<SecondPage<T>> second() {
        System.out.println("SecondPage method....");
        return this.thirdPage;
    }
}
