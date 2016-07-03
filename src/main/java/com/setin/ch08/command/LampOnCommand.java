package com.setin.ch08.command;

/**
 * Created by 두석 on 2016-06-25.
 */
public class LampOnCommand implements Command{
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
