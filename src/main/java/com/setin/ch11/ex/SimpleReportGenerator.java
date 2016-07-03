package com.setin.ch11.ex;

import java.util.List;

/**
 * Created by 두석 on 2016-07-03.
 */
public class SimpleReportGenerator {
    public String generate(List<Customer> customerList) {
        String report = String.format("고객 수 : %d명\n", customerList.size());
        for (Customer customer : customerList) {
            report += String.format("%s : %d\n", customer.getName(), customer.getPoint());

        }
        return report;
    }
}
