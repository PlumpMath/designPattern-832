package com.setin.ch07.상태패턴적용변경여부;

/**
 * Created by 두석 on 2016-06-20.
 */
public interface State {
    void increaseCoin(int coin, VendingMachine vm);
    void select(int productId, VendingMachine vm);

    boolean isSelecatable();
}
