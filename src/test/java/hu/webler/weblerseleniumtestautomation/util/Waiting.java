package hu.webler.weblerseleniumtestautomation.util;

import java.util.concurrent.TimeUnit;

public class Waiting {

    // Define a method to wait for a specified number of seconds
    public static void waitForSeconds(int second) {
        try {
            TimeUnit.SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Waiting() {

    }
}
