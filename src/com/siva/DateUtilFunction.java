package com.siva;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtilFunction {
    public static void main(String[] args) {
        System.out.println("-- getSysdateTimeStampForService "+ DateUtilFunction.getSysdateTimeStampForService());
//        DateUtilFunction.getSysDateTime();
        System.out.println("args = " + DateUtilFunction.getDate());
    }

    public static LocalDateTime getDate() {
        return LocalDateTime.now().minusDays(3);
    }

    public static Timestamp getSysdateTimeStampForService() {
        final Timestamp tsGmt = new Timestamp(System.currentTimeMillis());
        tsGmt.setNanos((int)(System.nanoTime() % 1000000000));
        return tsGmt;
    }

    public static void getSysDateTime() {
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        LocalDateTime  localDate = LocalDateTime.now();

//        1DG000W9-000WD-20200107123231
//        20200107 12 32 31

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH24");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(now.toString());            // 2019-06-14T15:50:36.068076300
        System.out.println(timestamp);

        String format1 = localDate.format(formatter1);
        String format = localDate.format(formatter);

        System.out.println("format = " + format1);
//        SecurityResourceException.showErrorMessage("Date error");
        System.out.println("format = " + format);

    }


}
