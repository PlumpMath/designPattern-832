package com.setin.ch13.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class SDScreen extends Screen {
    @Override
    public void drawMap(Map map) {
        System.out.println("Draw map " + map.getClass().getName() + " On SD Screen");
    }
}
