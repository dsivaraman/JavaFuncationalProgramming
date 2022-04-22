package com.backup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicate {

    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "mango", "apple", "orange"};

        //Duplicate fruits are: apple, orange

        Arrays.sort(fruits);

        StringBuilder res = new StringBuilder();
        int len = fruits.length;

        for(int i = 0; i< len; i++) {
            for (int j = i+1; j< len; j++) {
                if(fruits[i].equalsIgnoreCase(fruits[j])) {
                    res.append(fruits[i] + " ");
                }
            }
        }

        System.out.println("Duplicate fruits are: " + res);

//        Set<String> collect = Arrays.stream(fruit).filter(val -> !result.add(val)).collect(Collectors.toSet());

//        System.out.println("collect = " + collect);
    }
}
