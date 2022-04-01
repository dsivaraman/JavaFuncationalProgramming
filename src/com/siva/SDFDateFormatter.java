package com.siva;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SDFDateFormatter {
    public static void main(String[] args) throws ParseException {
        String pattern = "yyyy-MM-dd hh:mm:ss";
        String pattern1 = "yyyy-MM-dd hh:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
        Date date = simpleDateFormat.parse("2021-06-11 13:20:15");
//        System.out.println(date);

        Timestamp timestampFromString = getTimestampFromString("2021-06-11 08:46:25", pattern1);

        System.out.println("timestampFromString = " + timestampFromString.toString());
    }

    public static Timestamp getTimestampFromString(final String dateStr,
                                                   final String pattern) {

        final SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = dateFormat.parse(dateStr);
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return new Timestamp(date.getTime());
    }
}
