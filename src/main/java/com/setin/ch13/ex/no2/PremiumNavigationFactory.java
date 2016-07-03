package com.setin.ch13.ex.no2;

import com.setin.ch13.ex.*;

/**
 * Created by 두석 on 2016-07-03.
 */
public class PremiumNavigationFactory extends NavigationFactory {
    @Override
    public GPS createGps() {
        return new ExpensiveGPS();
    }

    @Override
    public Map createMap() {
        return new LargeMap();
    }

    @Override
    public Screen createScreen() {
        return new HDScreen();
    }

    @Override
    public PathFinder createPathFinder() {
        return new FastPathFinder();
    }
}
