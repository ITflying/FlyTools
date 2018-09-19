package com.hiabby.flytools.time;

import com.hiabby.flytools.flyutils.time.DateStyle;
import com.hiabby.flytools.flyutils.time.DateUtil;
import org.junit.Test;

import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;

public class DateUtilTest {

    // region 公用方法

    /**
     * 测试获取两个时间点之前相隔天数
     *
     * @throws ParseException
     */
    @Test
    public void test_getIntervalTime() throws ParseException {
        String beginTime = "2018-10-12";
        String endTime = "2018-09-19";
        String pattern = DateStyle.YYYY_MM_DD.getValue();

        int intervalDays = DateUtil.getIntervalTime(pattern, beginTime, endTime);
        System.out.println(beginTime + " 与 " + endTime + " 相隔：【" + intervalDays + "】天");
        assertThat(intervalDays).isEqualTo(23);
    }

    // endregion
}
