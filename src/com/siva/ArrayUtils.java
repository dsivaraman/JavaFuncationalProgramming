package com.siva;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        String CarrierAPICountryCode = "US,CA,MX,VQ,RQ,GQ,AQ,CQ,IN,AS,NZ,MY,RP,KS,TW,TH,VM";

        ArrayList<String> countryCodeList = new ArrayList<String>(Arrays.asList(CarrierAPICountryCode.split(",")));

        boolean containsCountryCode = countryCodeList.contains("GE");

        System.out.println("Value --- " + containsCountryCode);
    }
}
