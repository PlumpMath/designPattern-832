package com.setin.ch13.ex.no2;

import com.setin.ch13.ex.GPS;
import com.setin.ch13.ex.Map;
import com.setin.ch13.ex.PathFinder;
import com.setin.ch13.ex.Screen;

/**
 * Created by 두석 on 2016-07-03.
 */
public abstract class NavigationFactory {


    public abstract GPS createGps();

    public abstract Map createMap();

    public abstract Screen createScreen();

    public abstract PathFinder createPathFinder();

}
