package com.setin.ch13.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class CheapGPS extends GPS {
    public CheapGPS() {
    }

    @Override
    public Location findCurrentLocation() {
        System.out.println("Find current location with Cheap GPS");
        return null;
    }
}

