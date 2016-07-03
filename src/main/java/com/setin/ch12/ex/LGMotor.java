package com.setin.ch12.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class LGMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Move LG Motor : " + direction);
    }
}
