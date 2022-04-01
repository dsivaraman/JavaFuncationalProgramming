package com.siva;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {

        String val = "siva,priya,aadhi";

        String replaced = "'"+val.replace(",", "','")+"'";

        System.out.println("replaced = " + replaced);
    }
}
