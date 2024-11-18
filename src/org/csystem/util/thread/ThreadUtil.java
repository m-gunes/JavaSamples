package org.csystem.util.thread;

import java.util.concurrent.TimeUnit;

public class ThreadUtil {
    private ThreadUtil()
    {
    }

    public static void sleep(long milliseconds)
    {
        try {
            TimeUnit.MICROSECONDS.sleep(milliseconds);
        } catch (InterruptedException ignore) {

        }
    }
}
