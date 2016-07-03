package com.setin.ch08.command;

/**
 * Created by 두석 on 2016-06-25.
 */
public class AlarmOnCommand implements Command {

    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
