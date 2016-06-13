package com.setin.ch03.연습문제.no5;

/**
 * Created by 두석 on 2016-06-13.
 */
public class PayType01 implements PayType {

    private int 통상임금 = 0;
    private int 오버타임_임금 = 0;

    public PayType01(int 통상임금, int 오버타임_임금) {
        this.통상임금 = 통상임금;
        this.오버타임_임금 = 오버타임_임금;
    }

    @Override
    public int calcuate(Employee employee) {
        return 0;
    }
}
