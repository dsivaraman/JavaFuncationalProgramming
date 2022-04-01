package com.siva;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class BooleanTest {

    public static void main(String[] args) {

        Timestamp lastRunTime = Timestamp.valueOf("2020-09-16 11:31:52.237");

        Timestamp current = getSysdateGmtTimeStamp();

        long duration = current.getTime() - lastRunTime.getTime();

        System.out.println("time --- "+ duration);
    }

    public static Timestamp getSysdateGmtTimeStamp() {
        final Date sysdt = new Date();
        final Calendar theCalendar = Calendar.getInstance();
        theCalendar.setTime(sysdt);
        final Timestamp tsGmt = convertCalToGmtTimeStamp(theCalendar);
        return tsGmt;
    }

    public static Timestamp convertCalToGmtTimeStamp(
            final Calendar estDate) {
        final String METHOD_NAME = "convertCalToGMTTimeStamp";
        Timestamp tsGmt = null;
        try {
            final TimeZone timezoneGmt = TimeZone.getTimeZone("GMT");
            estDate.setTimeZone(timezoneGmt);
            final Calendar cal = Calendar.getInstance();
            // If application care upto millisecond then we have to use the
            // comented line.
            final int milliSeconds = estDate.get(Calendar.MILLISECOND);
            // cal.clear();
            cal.set(estDate.get(Calendar.YEAR), estDate.get(Calendar.MONTH),
                    estDate.get(Calendar.DATE),
                    estDate.get(Calendar.HOUR_OF_DAY),
                    estDate.get(Calendar.MINUTE), estDate.get(Calendar.SECOND));
            cal.set(Calendar.MILLISECOND, milliSeconds);
            final Date dtGmt = cal.getTime();
            tsGmt = new Timestamp(dtGmt.getTime());
        } catch (final Exception exp) {
        }

        // ts.setNanos(getNano); if needed convert and add it here.
        return tsGmt;
    }
}
