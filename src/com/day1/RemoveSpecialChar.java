package com.day1;

import java.util.Arrays;

public class RemoveSpecialChar {
    public static void main(String[] args) {

        String str = "dsag%&^%^&%%322352543shjsTRYTRT#$#";

        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        String res = new String();
        System.out.println("s = " + s);

        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            System.out.println("res.indexOf(c) = " + res.indexOf(c));
            if(res.indexOf(c) < 0) {

                res += c;
            }
        }
        System.out.println("str = " + res);
    }
}
