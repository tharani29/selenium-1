package org.sayem.forms;

import org.sayem.algorithm.Retry;
import org.sayem.converters.OptionalGetter;
import org.sayem.locators.Locators;
import org.sayem.selenium.Element;
import org.sayem.selenium.Locating;
import org.sayem.selenium.SearchScope;
import org.openqa.selenium.By;
import org.slf4j.Logger;

import java.io.File;
import java.util.Optional;
import java.util.function.Supplier;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by sayem on 12/4/15.
 */
public class FileInput<T extends SearchScope<T>> extends Locating<T, Optional<Element>> {

    public static final Logger log = getLogger(FileInput.class);

    /**
     * Constructor of the input field.
     *
     * @param where    where
     * @param selector selector
     */
    public FileInput(T where, Supplier<By> selector) {
        super(where, Locators.<T>optionalElement(selector));
    }

    public void put(File file) {
        final Retry retry = new Retry(5, 1, SECONDS);
        try {
            retry.attempt(() -> {
                Element element = locate(OptionalGetter.GET);
                element.sendKeys(file.getAbsolutePath());
                return null;
            });
        } catch (Exception e) {
            log.info("Failed to set file {}", file);
        }
    }
}
