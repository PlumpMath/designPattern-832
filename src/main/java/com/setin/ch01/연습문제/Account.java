package com.setin.ch01.연습문제;

/**
 * Created by 두석 on 2016-06-06.
 */
public class Account {
    private int id;
    private String owner;
    private double balance;


    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (this.balance < amount) {
            throw new RuntimeException("인출금액이 예금액보다 큽니다.");
        }
        this.balance = this.balance - amount;
        return amount;
    }

    protected double getBalance() {
        return this.balance;
    }

}
