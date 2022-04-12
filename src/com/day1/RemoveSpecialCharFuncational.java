package com.day1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveSpecialCharFuncational {
    public static void main(String[] args) {

        String str = "dsag%&^%^&%%322352543shjsTRYTRT#$#";

//        Character[] characters = str.replaceAll("[^a-zA-Z0-9]", "").chars().mapToObj(c -> (char) c).toArray(Character[]::new);
//        HashSet<Character> r = new HashSet<>();
//        Set<Character> collect = Arrays.stream(characters).sequential().collect(Collectors.toSet());
//        collect.forEach(System.out::println);

        String s1 = str.replaceAll("[^a-zA-Z0-9]", "");

        LinkedHashSet<String> string_set = new LinkedHashSet<>(Arrays.asList(s1.split("")));
        LinkedHashSet<String> string_set1 = new LinkedHashSet<>();

        String collect2 = Arrays.stream(s1.split("")).filter(string_set1::add).collect(Collectors.joining());

        String collect1 = string_set.stream().collect(Collectors.joining());
        String collect = String.join("", string_set);

        // Printing  the setOfString
        System.out.println("String: " + collect1);
        System.out.println("String2: " + collect2);



//        Map<Character, Long> collect1 =  Arrays.stream(characters).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        collect1.entrySet().stream()
//                .peek(System.out::println)
//                .filter(x -> x.getValue() <= 1)
//                .map(Map.Entry::getKey)
//                .forEachOrdered(System.out::println);



//        collect.stream().collect(Collectors.toSet());

//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//                        .entrySet().stream().filter(v -> v.getValue() == 1)
//                        .map(Map.Entry::getKey)
//                .forEach(System.out::println);
//                                .collect(Collectors.toSet());


        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        String res = new String();
        System.out.println("s = " + s);

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
//            System.out.println("res.indexOf(c) = " + res.indexOf(c));
            if(res.indexOf(c) < 0) {

                res += c;
            }
        }
        System.out.println("str = " + res);
    }
}
