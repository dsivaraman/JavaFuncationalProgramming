package com.chargebee;

import static com.chargebee.HystrixProperties.MAX_THRESHOLD_COUNT;

public class HystrixImplementation {

    public HystrixProperties hystrixProperties;
    public MockRestService mockRestService;
    private int sleepTime = 1;

        public HystrixImplementation (HystrixProperties hystrixProperties , MockRestService mockRestService) {
            this.hystrixProperties = hystrixProperties;
            this.mockRestService = mockRestService;
        }


    public void recursiveRetry() throws InterruptedException {

        if (sleepTime > 0) {
            Thread.sleep(sleepTime);
        }

        int statusCode = mockRestService.execute();

        if (StatusCode.isSuccessCode(statusCode)) {
            hystrixProperties.setRetryCount(0);
            sleepTime = 0;
        } else if (StatusCode.isFailureCode(statusCode)) {
            if(MAX_THRESHOLD_COUNT == hystrixProperties.getRetryCount()) {
                hystrixProperties.setSleepTimeCounter(sleepTime + sleepTime);
            } else if (MAX_THRESHOLD_COUNT < hystrixProperties.getRetryCount()) {
                hystrixProperties.setRetryCount(hystrixProperties.getRetryCount() + 1);
                recursiveRetry();
            }
        }
    }
}

class MockRestService {

    public int execute() {
        // If service return the failure status code like 400, 404..
        return 404;
    }
}