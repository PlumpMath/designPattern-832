package com.setin.ch06;

/**
 * Created by 두석 on 2016-06-20.
 * SingletonHolder패턴 *
 */
public class SingleTon2 {
    private SingleTon2() {
    }

    private static class SingletonHolder {
        private static final SingleTon2 INSTANCE = new SingleTon2();
    }

    public static SingleTon2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
