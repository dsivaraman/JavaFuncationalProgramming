package com.siva;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFilter {
    public static void main(String[] args) {

        List<String> word = Arrays.asList("fool", "stupid");

        String email = "@jeofool@gmail.com";

        boolean anyMatch = word.stream().anyMatch(email::contains);

        System.out.println("--match -- " + anyMatch);

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String longRegex = "^[0-9]{1,9}$";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(email);
        System.out.println("mail validation -- " + matcher.matches());

        Pattern l = Pattern.compile(longRegex);
        Matcher lMatcher = l.matcher("1234567890");
        System.out.println("long validation -- " + lMatcher.matches());
    }
}
