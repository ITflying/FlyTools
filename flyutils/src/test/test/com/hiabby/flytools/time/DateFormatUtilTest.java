package com.hiabby.flytools.time;

import com.hiabby.flytools.flyutils.time.DateFormatUtil;
import org.junit.Test;

import java.text.ParseException;

public class DateFormatUtilTest {

    @Test
    public void test_parseDate_TC1() throws ParseException {
        DateFormatUtil.parseDate(null, null);
    }
}
