package com.setin.ch03.연습문제.no5;

/**
 * Created by 두석 on 2016-06-13.
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        PayType payType = new PayType01(6000, 10000);

        employee.setPayType(payType);
        employee.setOverTimeHours(5);
        employee.setWorkHours(5);

        System.out.println(employee.calculatePay());

    }
}
