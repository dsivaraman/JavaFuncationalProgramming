package com.siva;

import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {

        String yyyymmddhhmmssPattern = "(?:(?:(?:(?:(?:[13579][26]|[2468][048])00)|(?:[0-9]{2}(?:(?:[13579][26])|(?:[2468][048]|0[48]))))(?:(?:(?:09|04|06|11)(?:0[1-9]|1[0-9]|2[0-9]|30))|(?:(?:01|03|05|07|08|10|12)(?:0[1-9]|1[0-9]|2[0-9]|3[01]))|(?:02(?:0[1-9]|1[0-9]|2[0-9]))))|(?:[0-9]{4}(?:(?:(?:09|04|06|11)(?:0[1-9]|1[0-9]|2[0-9]|30))|(?:(?:01|03|05|07|08|10|12)(?:0[1-9]|1[0-9]|2[0-9]|3[01]))|(?:02(?:[01][0-9]|2[0-8])))))(?:0[0-9]|1[0-9]|2[0-3])(?:[0-5][0-9]){2}";

        Pattern p = Pattern.compile(yyyymmddhhmmssPattern);

        if (p.matcher("20200107123231").matches()) {
            System.out.println("true = " + true);
        } else {
            System.out.println("false = " + false);
        }
    }
}
