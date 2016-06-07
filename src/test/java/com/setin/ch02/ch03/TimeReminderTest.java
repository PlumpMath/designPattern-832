package com.setin.ch02.ch03;

import com.setin.ch03.MockTimeProvider;
import com.setin.ch03.TimeReminder2;

/**
 * Created by 두석 on 2016-06-07.
 */
public class TimeReminderTest {
    public static void main(String[] args) {
        TimeReminder2 timeReminder2 = new TimeReminder2();
        MockTimeProvider mockTimeProvider = new MockTimeProvider();
        mockTimeProvider.setHours(22);
        timeReminder2.setTimeProvider(mockTimeProvider);
        timeReminder2.reminder();


    }
}
