package org.sayem.pages;

import java.util.function.BiConsumer;

/**
 * Created by sayem on 12/5/15.
 */
public class ThirdPage<T extends BasePage<?>> extends BasePage<T> {

    public ThirdPage(Page page) {
        super(page);
    }

    public void third(BiConsumer<String, String> consumer){
        System.out.println("third....");
        consumer.accept("", "");
    }
}
