package com.setin.ch11.ex.no5;

import com.setin.ch11.ex.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 두석 on 2016-07-03.
 */
public class ComplexReportGenerator extends ReportGenerator {

    @Override
    String getHearder(List<Customer> customers) {
        return String.format("고객 수 : %s 명입니다.\n", customers.size());
    }

    @Override
    String getFooter(List<Customer> customers) {
        return String.format("점수 합계: %d \n ", sumPoint(customers));
    }

    private int sumPoint(List<Customer> customers) {
        int sumPoint = 0;
        for (Customer customer : customers) {
            sumPoint += customer.getPoint();
        }
        return sumPoint;
    }

    @Override
    List<Customer> getCondition(List<Customer> customers) {

        List<Customer> selectCustomers = new ArrayList<>();

        for (Customer customer : customers) {
            if(conditionCheck(customer)){
                selectCustomers.add(customer);
            }
        }
        return selectCustomers;
    }

    private boolean conditionCheck(Customer customer) {
        return customer.getPoint() >= 150;
    }

    @Override
    String getFormat(Customer customers) {
        return String.format("%d : %s \n", customers.getPoint(), customers.getName());
    }
}
