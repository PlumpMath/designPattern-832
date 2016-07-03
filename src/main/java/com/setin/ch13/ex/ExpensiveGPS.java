package com.setin.ch13.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class ExpensiveGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Expensive GPS");
        return null;
    }

}
