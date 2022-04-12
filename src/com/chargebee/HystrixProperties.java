package com.chargebee;

public class HystrixProperties {

    public static final int MAX_THRESHOLD_COUNT = 5;

    private int retryCount = 0;
    private int sleepTimeCounter = 1;

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getSleepTimeCounter() {
        return sleepTimeCounter;
    }

    public void setSleepTimeCounter(int sleepTimeCounter) {
        this.sleepTimeCounter = sleepTimeCounter;
    }
}
