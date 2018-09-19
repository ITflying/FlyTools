package com.hiabby.flytools.flyutils.time;

import com.sun.istack.internal.NotNull;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

public class DateFormatUtil {

    public static Date parseDate(@NotNull String pattern, @NotNull String dateString) throws ParseException {
        return FastDateFormat.getInstance(pattern).parse(dateString);
    }
}
