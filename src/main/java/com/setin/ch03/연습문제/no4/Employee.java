package com.setin.ch03.연습문제.no4;

/**
 * Created by 두석 on 2016-06-13.
 */
public class Employee {
    private String id;
    private String name;
    private int workHours;
    private int overTimeHours;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 임금 계산
     *
     * @return
     */
    public int calculatePay() {
        int amount = 10000 * this.getWorkHours() + 15000 * this.getOverTimeHours();
        System.out.println(amount);
        return amount;
    }
}
