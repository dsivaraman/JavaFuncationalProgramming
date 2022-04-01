package com.siva;

import java.util.Map;

public class BiConsumerMain {
    public static void main(String[] args) {

//        if (Utils.securityObjectFMTType.containsKey("Base64 ASCII")) {
//            System.out.println("Utils.SecurityObjectFMTType = " + Utils.securityObjectFMTType.get("Base64 ASCII"));
//        }

        Utils.securityObjectFMTType.entrySet().stream().filter(x -> x.getKey().equalsIgnoreCase("Base64 ASCII"))
                .map(Map.Entry::getValue)
                .findFirst()
                .ifPresent(p -> System.out.println(" sec "+ p));


//        List<Profile> list = new ArrayList<>();
//            String name = "raman";
//        if (name.equalsIgnoreCase("siva")) {
//        list.add(AppUtils.fieldDuplicateError.apply("First name"));
//        } else if (name.equalsIgnoreCase("raman")) {
//            list.add(AppUtils.fieldDuplicateError.apply("Lastname"));
//        } else if (name.equalsIgnoreCase("age")) {
//            list.add(AppUtils.fieldDuplicateError.apply("Age field"));
//        }
//
//        list.forEach(System.out::println);


    }
}
