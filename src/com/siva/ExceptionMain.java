package com.siva;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExceptionMain {
    public static void main(String[] args) {
//        System.out.println("ExceptionMain.main");
//        SecurityResourceException.showErrorMessage("Hello, this is runtime exception from main");

        AtomicBoolean val = new AtomicBoolean(false);
        AtomicBoolean bool = new AtomicBoolean(false);
        AtomicReference<String> st = new AtomicReference<>("siva");


//        Consumer<String> str = (s) -> bool.set(true);
//        Consumer<String> str1 = s1 -> st.set(s1);
//        str1.accept("hello");
//        System.out.println("str = " + st);

        List<String> name = new ArrayList<>();
        name.add("1");
        name.add("2");

        if (Utils.notNull.test(name)) {
            name.forEach(System.out::println);
        }
    }
}
