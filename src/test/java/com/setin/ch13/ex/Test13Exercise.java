package com.setin.ch13.ex;

import org.junit.Test;

/**
 * Created by 두석 on 2016-07-03.
 */
public class Test13Exercise {
    @Test
    public void testNo1(){
        GPS gps = new CheapGPS();
        Screen mapScreen = new SDScreen();
        PathFinder  pathFinder  = new SlowPathFinder();

        Map map= new SmallMap();
        mapScreen.drawMap(map);

        Location l1 = gps.findCurrentLocation();
        Location l2 = gps.findCurrentLocation();

        pathFinder.findPath(l1, l2);
    }
}
