package com.siva;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ForLoop {

    public static void main(String[] args) {

//        long[] as = {10L, 20L, 30L};
//        long[] bs = {40L, 50L, 60L};

//        List<Long> as = Arrays.asList(10L, 20L, 30L);
//        List<Long> bs = Arrays.asList(40L, 50L, 60L);
//        IntStream.range(0, Math.min(as.size(), bs.size())).forEach(i -> show(as.get(i), bs.get(i)));

        System.out.println(" letter : " + findValue(78L));
    }

    public static void show(long l1, long l2) {
        System.out.println( " ---- " + l1 + " " + l2);
    }

    public static String findValue(Long num) {
        if (num == 1 ) return "A";
        if (num >= 2 && num <= 7 ) return "B";
        if (num >= 8 && num <= 19 ) return "C";
        if (num >= 20 && num <= 49 ) return "D";
        if (num >= 50 && num <= 100 ) return "E";
        if (num > 100 ) return "F";
        return "";
    }


    //        List<Map.Entry<Long, Long>> subjectNumArr = new ArrayList<>(as.size());
//        if (as.size() == bs.size()) {
//            for (int i = 0; i < as.size(); ++i) {
//                subjectNumArr.add(new AbstractMap.SimpleEntry<Long, Long>(as.get(i), bs.get(i)));
//            }
//        }
//
//        for (Map.Entry<Long, Long> entry : subjectNumArr) {
//            Long key = entry.getKey();
//            Long value = entry.getValue();
//            System.out.println(" list - " + key + value);
//        }
}
