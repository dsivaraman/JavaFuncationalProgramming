package com.siva;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class OptionalMain {
    public static void main(String[] args) {

//        AtomicInteger val = new AtomicInteger(0);
//
//        val.getAndIncrement();
//        val.getAndIncrement();
//        val.getAndIncrement();
//
//        System.out.println("val = " + val);


        int sum=0;
        for (int i=0; i<5; i++) {
            int val = 10;
            System.out.println("out " + i + "  const : "+ val);
        }
    }
}
