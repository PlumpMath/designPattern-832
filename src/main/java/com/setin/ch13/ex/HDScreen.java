package com.setin.ch13.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class HDScreen extends Screen {
    @Override
    public void drawMap(Map map) {
        System.out.println("Drwa map " + map.getClass().getName() + " on HD screen");
    }
}
