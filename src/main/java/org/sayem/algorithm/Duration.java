package org.sayem.algorithm;

import java.util.concurrent.TimeUnit;

/**
 * Created by sayem on 12/4/15.
 */
public class Duration {
    private final int duration;
    private final TimeUnit timeUnit;

    public Duration(int duration, TimeUnit timeUnit) {
        this.duration = duration;
        this.timeUnit = timeUnit;
    }

    public void elapse() {
        try {
            timeUnit.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
