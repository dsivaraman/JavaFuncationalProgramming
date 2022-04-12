package com.day1;

import java.util.HashMap;
import java.util.Map;

public class CharCount{

    public static void main(String []args){
        System.out.println("Hello World");
        String str = "aabbbcccc";
        compare(str);
    }

    public static void compare(String str) {

        Map<Character,Integer> stringMap = new HashMap<Character,Integer>();

        for(int i = 0 ; i < str.length(); i++) {
            char value = str.charAt(i);
            if (stringMap.containsKey(value)) {
                int count = stringMap.get(value)+1;
                stringMap.put(value,count);
            }else{
                stringMap.put(value,1);
            }
        }

        String res = "";
        for (Map.Entry<Character,Integer> entry : stringMap.entrySet()) {
            res = res + ""+entry.getKey() + entry.getValue();
            //System.out.println(""+entry.getKey() + entry.getValue());
        }
        System.out.println(res);
    }
}