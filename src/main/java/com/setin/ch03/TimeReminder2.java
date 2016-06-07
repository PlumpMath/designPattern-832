package com.setin.ch03;

/**
 * Created by 두석 on 2016-06-07.
 */
public class TimeReminder2 {
    private TimeProvider timeProvider;
    private MP3 mp3 = new MP3();

    public void setTimeProvider(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public void reminder() {
        int hour = timeProvider.getTime();
        if (hour >= 22) {
            mp3.playSong();
        }
    }
}
