package org.sayem.algorithm;

import org.testng.log4testng.Logger;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.log4testng.Logger.getLogger;

/**
 * Created by sayem on 12/4/15.
 */
public interface Retryable<T> {

    Logger LOGGER = getLogger(Retryable.class);

    default T retry(Attemptable<T> task) {
        final Retry retry = new Retry(3, 3, SECONDS);
        try {
            return retry.attempt(task);
        } catch (Exception e) {
            LOGGER.info(retry);
            throw new RuntimeException(e);
        }
    }
}