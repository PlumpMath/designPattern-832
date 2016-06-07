package com.setin.ch02;

/**
 * Created by 두석 on 2016-06-06.
 */
public class Test {


    public static void main(String[] args) {
        Person p = new Person();
        p.setRole(new Driver());
        p.doIt();
        p.setRole(new Worker());
        p.doIt();
    }

}
