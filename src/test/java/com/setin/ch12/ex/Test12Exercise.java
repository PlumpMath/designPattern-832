package com.setin.ch12.ex;

import org.junit.Test;

/**
 * Created by 두석 on 2016-07-03.
 */
public class Test12Exercise {

    @Test
    public void testNo1(){
        Motor lgMotor = new LGMotor();
        ElevatorController controller1 = new ElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyundaiMotor = new HyundaiMotor();
        ElevatorController controller2 = new ElevatorController(2, hyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
