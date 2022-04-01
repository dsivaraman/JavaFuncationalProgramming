package com.siva;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class MatchTest {
    public static void main(String[] args) {

         ArrayList<String> test = new ArrayList<>();
        AtomicReference<String> stringAtomicReference = new AtomicReference<>(null);

        boolean noneMatch = Stream.of("siva", "ram", "aadhi", "priya")
                .anyMatch(s -> s.equalsIgnoreCase("siva"));

        System.out.println("test --" + noneMatch);

        System.out.println("--- atomic " + stringAtomicReference.get());
    }
}
