package com.day1;

import java.util.*;
class LongestSubString {

    static int longestUniqueSubsttr(String s)
    {

        // Creating a set to store the last positions of occurrence
        HashMap<Character, Integer> seen = new HashMap<>();
        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for(int end = 0; end < s.length(); end++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(s.charAt(end)))
            {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end-start + 1);

        }
        return maximum_length;
    }

    static LinkedHashMap<Character, Integer> longestUniqueSubsttr1(String s)
    {

        // Creating a set to store the last positions of occurrence
        LinkedHashMap<Character, Integer> seen = new LinkedHashMap<>();

        int maximum_length = 0;

        // starting the initial point of window to index 0
        int start = 0;

        for(int end = 0; end < s.length(); end++)
        {
            // Checking if we have already seen the element or not
            if(seen.containsKey(s.charAt(end)))
            {
                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(s.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(s.charAt(end), end);
            maximum_length = Math.max(maximum_length, end-start + 1);
        }

        //            for (Map.Entry ans : seen.entrySet()) {
//                System.out.println("ans = " + ans.getKey());
//            }
        return seen;
    }

    // Driver code
    public static void main(String []args)
    {
        String s = "geeksforgeeks";
        System.out.println("The input String is " + s);
        LinkedHashMap<Character, Integer> length = longestUniqueSubsttr1(s);

                    for (Map.Entry ans : length.entrySet()) {
                System.out.println("ans = " + ans.getKey());
            }

        System.out.println("The length of the longest non-repeating character substring is " + length.size());
    }
}

// This code is contributed by rutvik_56.

