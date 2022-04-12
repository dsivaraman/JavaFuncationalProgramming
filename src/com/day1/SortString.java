package com.day1;

import java.util.Arrays;

// Main class
class SortString {

    // Main driver method
    public static void main(String[] args) throws Exception
    {
        // Custom string input
        String str = "dasdTDSJK1234dkjsh";

        // Converting string into an array for computation
        char arr[] = str.toCharArray();

        // Nested loops for comparison of characters
        // in above character array

        Arrays.sort(arr);
        System.out.println("Sort :: " + new String(arr));

        char temp;

        for(int i=0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//                System.out.println(String.format("%s for i & %s for j", i, j));
                if (arr[j] <= arr[i]) {

                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        int i = 0;
//        while (i <= arr.length) {
//            int j = i + 1;
//            while (j <= arr.length) {
//                System.out.println(String.format("%s for i & %s for j", i, j));
//                if (arr[j] <= arr[i]) {
//
//                    // Comparing the characters one by one
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j += 1;
//            }
//            i += 1;
//        }

        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
    }
}

