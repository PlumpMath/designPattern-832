package com.setin.ch03.연습문제;

import com.setin.ch03.연습문제.no4.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 두석 on 2016-06-13.
 */
public class PayrollManager {
    private List<Employee> employees = new ArrayList<>();

    public void writeEmployeePay(){
        Iterator<Employee> iter = employees.iterator();
        while (iter.hasNext()){
            Employee curEmp = iter.next();
            System.out.println(curEmp.calculatePay());
        }
    }

}
