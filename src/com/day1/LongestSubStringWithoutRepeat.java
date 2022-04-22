package com.day1;
// Java program to find
// and print longest substring
// without repeating characters.
import java.util.*;
class LongestSubStringWithoutRepeat{

    // Function to find and print longest
// substring without repeating characters.
    public static String findLongestSubstring(String str)
    {
        int i;
        int n = str.length();

        // Starting point of current substring.
        int st = 0;
        int currlen = 0;
        int maxlen = 0;

        // starting index of
        // maximum length substring.
        int start = 0;

        HashMap<Character, Integer> pos = new HashMap<Character, Integer>();

        // Last occurrence of first character is index 0;
        pos.put(str.charAt(0), 0);

        for (i = 1; i < n; i++) {
            if (!pos.containsKey(str.charAt(i))) {
                pos.put(str.charAt(i), i);
            }
            else if (pos.get(str.charAt(i)) >= st) {
                    currlen = i - st;
                    if (maxlen < currlen) {
                        maxlen = currlen;
                        start = st;
                    }
                    st = pos.get(str.charAt(i)) + 1;
                }
                pos.replace(str.charAt(i), i);
        }

        if (maxlen < i - st) {
            maxlen = i - st;
            start = st;
        }

        return str.substring(start, start + maxlen);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "GEEKSFORGEEKS";
        System.out.print(findLongestSubstring(str));
    }
}

