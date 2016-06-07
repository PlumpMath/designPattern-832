package com.setin.ch03;

import java.util.Calendar;

/**
 * Created by 두석 on 2016-06-07.
 */
public class TimeReminder {
    private MP3 m;

    public void reminder() {
        Calendar calendar = Calendar.getInstance();
        m = new MP3();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 22) {
            m.playSong();
        }
    }


}
