package com.siva;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapMain {
    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("Name1", "siva");
//        map.put("Name2", "raman");
//
//        boolean present = Optional.ofNullable(map.get("Name2")).filter("raman"::equals).isPresent();
//
//        System.out.println("present = " + present);

        String name = "siva";

        System.out.println("-- big "+ new BigDecimal(name));
    }
}
