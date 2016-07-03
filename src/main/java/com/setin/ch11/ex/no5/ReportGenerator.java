package com.setin.ch11.ex.no5;

import com.setin.ch11.ex.Customer;

import java.util.List;

/**
 * Created by 두석 on 2016-07-03.
 */
public abstract class ReportGenerator {

    public String generate(final List<Customer> customers) {

        List<Customer> conditionCustomers = getCondition(customers);

        StringBuilder reports = new StringBuilder();

        reports.append(getHearder(conditionCustomers));

        for (Customer customer : conditionCustomers) {
            reports.append(getFormat(customer));
        }

        reports.append(getFooter(conditionCustomers));

        return reports.toString();

    }

    /**
     * Hearder 출력
     * @param customers
     * @return
     */
    abstract String getHearder(List<Customer> customers);


    /**
     * footer 출력
     * @param customers
     * @return
     */
    abstract String getFooter(List<Customer> customers);

    /**
     * 회원 중 출력할 대상을 변경
     * @param customers
     * @return
     */
    abstract List<Customer> getCondition(List<Customer> customers);

    /**
     * 기본 회원 출력 포맷으로
     * @param customers
     * @return
     */
    abstract String getFormat(Customer customers);

}
