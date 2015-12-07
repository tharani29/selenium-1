package org.sayem.pages;

import java.util.function.BiConsumer;

/**
 * Created by sayem on 12/4/15.
 */
public class SecondPage<T extends BasePage<?>> extends BasePage<T> {

    private final ThirdPage<SecondPage<T>> thirdPage;

    protected SecondPage(Page page) {
        super(page);
        this.thirdPage = new ThirdPage<>(this);
    }

    public ThirdPage<SecondPage<T>> second(BiConsumer<String, String> consumer){
        System.out.println("second.....");
        consumer.accept("", "");
        return this.thirdPage;
    }
}
