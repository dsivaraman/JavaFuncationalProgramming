package com.day1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class DuplicateUnique {
    public static void main(String[] args) {
        DuplicateUnique mn = new DuplicateUnique();
        Integer[] intArray = {1,2,3,6,5,6};
//        boolean result = mn.isUnique(intArray);
//        System.out.println(result);
//        int[] uniqueNumber = mn.getUniqueNumber(intArray);

        Set<Integer> items = new HashSet<Integer>();
        Set<Integer> collect = Arrays.stream(intArray).filter(v -> !items.add(v)).collect(Collectors.toSet());

        Map<Integer, Long> collect1 = Arrays.stream(intArray)
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()));

        Set<Integer> collect2 = collect1.entrySet().stream().filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("uniqueNumber = " + collect2);
    }

    // Is Unique
    public boolean isUnique(int[] intArray) {
        for (int i =0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[] getUniqueNumber(int[] intArray) {
        int[] unique = new int[intArray.length+1];
        int z = 0;
        for (int i =0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i] != intArray[j]) {
                    unique[z] = intArray[i];
                    z++;
                }
            }
        }
        return unique;
    }

}

