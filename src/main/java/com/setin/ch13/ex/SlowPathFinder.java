package com.setin.ch13.ex;

/**
 * Created by 두석 on 2016-07-03.
 */
public class SlowPathFinder extends PathFinder {
    @Override
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}
