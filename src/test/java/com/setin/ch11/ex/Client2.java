package com.setin.ch11.ex;

import com.setin.ch11.ex.no5.ComplexReportGenerator;
import com.setin.ch11.ex.no5.ReportGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 두석 on 2016-07-03.
 */
public class Client2 {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("홍길동", 150));
        customers.add(new Customer("우수한", 350));
        customers.add(new Customer("부족한", 50));
        customers.add(new Customer("훌륭한", 450));
        customers.add(new Customer("최고의", 550));


        ReportGenerator complexReportGenerator =  new ComplexReportGenerator();
        System.out.println(complexReportGenerator.generate(customers));
    }
}
