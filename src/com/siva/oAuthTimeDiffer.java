package com.siva;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.MINUTES;

public class oAuthTimeDiffer {
    public static void main(String[] args) {
        LocalTime expire_at = LocalTime.parse("16:59:28.2079012");

        LocalTime present = LocalTime.now();

        System.out.println("--- " + MINUTES.between(present, expire_at));

        int before = expire_at.minusSeconds(2340L).compareTo(LocalTime.now());

        if(before > 0)
            System.out.println("\nThe first LocalTime object is greater than the second LocalTimeobject");
        else if(before < 0)
            System.out.println("\nThe first LocalTime object is lesser than the second LocalTimeobject");
        else
            System.out.println("\nThe LocalTime objects are equal");

        System.out.println("-- boolean " + before);
    }
}
