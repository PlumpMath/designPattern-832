package com.setin.ch03;

import java.util.Calendar;

/**
 * Created by 두석 on 2016-06-07.
 */
public class RealTimeProvider implements TimeProvider {

    private Calendar calendar;

    public RealTimeProvider() {
        this.calendar = Calendar.getInstance();
    }

    public RealTimeProvider(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void setHours(int hours) {
        calendar.set(Calendar.HOUR_OF_DAY, hours);
    }

    @Override
    public int getTime() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
