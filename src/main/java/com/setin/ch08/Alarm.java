package com.setin.ch08;

/**
 * Created by 두석 on 2016-06-25.
 */
public class Alarm {

    public void start(){
        System.out.println("Alaraming...");
    }
}

class Button2 {
    private Alarm alarm;

    public Button2(Alarm theAlarm){
        this.alarm = theAlarm;
    }

    public void pressed(){
        alarm.start();
    }
}


class AlaramClient{
    public static void main(String[] args) {
        Alarm al = new Alarm();
        Button2 lamButton = new Button2(al);
        lamButton.pressed();
    }
}

