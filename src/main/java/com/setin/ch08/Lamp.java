package com.setin.ch08;

/**
 * Created by 두석 on 2016-06-25.
 */
public class Lamp {
    public void turnOn() {
        System.out.println("Lamp On");
    }
}

class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void pressed() {
        theLamp.turnOn();
    }
}

class Clinet {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button lamButton = new Button(lamp);
        lamButton.pressed();
    }
}