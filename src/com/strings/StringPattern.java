package com.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringPattern {
    public static void main(String[] args) {

        boolean matches = Pattern.matches("[U]" +
                        "[0-9_A-Z&&[^BIOQS]]" +
                        "[1-9A-C]" +
                        "[0-9_A-Z&&[^BIOQS]]" +
                        "[0-9_A-Z&&[^AEIOU]]" +
                        "[0-9_A-Z&&[^AEIOU]]" +
                        "[0-9_A-Z&&[^AEIOU]]" +
                        "[0-9_A-Z&&[^AEIOU]]",
                "UBR00115"  );
//                U5975BZ7
//                UA3201S3
//        System.out.println("match == " + matches);

        StringPattern stringPattern = new StringPattern();
        String test = stringPattern.test();
        System.out.println("test = " + test);

    }

    public String test () {
        try {
            return "true";
        } catch (RuntimeException e) {
            System.out.println("e = " + e.getMessage());
        } finally {
            return "false";
        }
    }
}
