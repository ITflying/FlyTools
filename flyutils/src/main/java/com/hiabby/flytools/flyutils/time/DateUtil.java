package com.hiabby.flytools.flyutils.time;

import com.sun.istack.internal.NotNull;

import java.text.ParseException;
import java.util.Date;

public class DateUtil {

    /**
     * 获取两个时间的相隔天数
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public static int getIntervalTime(@NotNull String pattern,
                                      @NotNull String beginTime,
                                      @NotNull String endTime) throws ParseException {
        Date beginDate = DateFormatUtil.parseDate(pattern, beginTime);
        Date endDate = DateFormatUtil.parseDate(pattern, endTime);
        long timeInterval = Math.abs(beginDate.getTime() - endDate.getTime());
        int timeIntervalDay = (int) (timeInterval / (1000 * 3600 * 24));
        return timeIntervalDay;
    }
}
