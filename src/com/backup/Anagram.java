package com.backup;

import java.util.Arrays;

public class Anagram {

    static boolean checkIsAnagram(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        Arrays.compare(chars1, chars2);

        return false;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "slient";

        boolean isAnagram = checkIsAnagram(s1, s2);

        System.out.println("isAnagram = " + isAnagram);
    }
}
