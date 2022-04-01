package com.siva;

public class StringUtil {

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        String trimString = stringUtil.trimString("                              ");
        String trimString1 = stringUtil.trimString1(" ");

        System.out.println("trimString = " + trimString1);

        System.out.println("trimString.equalsIgnoreCase() = " + trimString1.equalsIgnoreCase(""));
    }

    public String trimString(String StringValue){

        if(StringValue!=null && !"".equals(StringValue)){
            return StringValue.trim();
        }
        return null;
    }

    public String trimString1(String StringValue){

        if(StringValue!=null && !"".equals(StringValue.trim())){
            return StringValue.trim();
        }
        return null;
    }
}
