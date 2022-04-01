package com.siva;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

    public static void main(String[] args) {

//        ArrayList<String> test = new ArrayList<>();
//        test.add("ECG");
//        test.add("SYNC4");
//        test.add("OBCC");
//        test.add("TBOX2");
//        test.add("IWID");
//
//        Function<String, Boolean> isModuleTypeExist = moduleTypeValue -> test.stream()
//                .anyMatch(s -> s.equalsIgnoreCase(moduleTypeValue));
//
//        Function<String, Boolean> isModuleTypeNotExist = moduleTypeValue -> test.stream()
//                .anyMatch(s -> s.equalsIgnoreCase(moduleTypeValue));
//
//        System.out.println("isModuleTypeNotExist = " + isModuleTypeNotExist.apply("ec"));

        String name = "siva";
        Predicate<String> notNull = Objects::nonNull;
        if (notNull.test(name)) {
            System.out.println(" true block ");
        } else {
            System.out.println("false block");
        }

    }


}
