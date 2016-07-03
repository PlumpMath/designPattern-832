package com.setin.ch07.상태패턴적용변경여부;

/**
 * Created by 두석 on 2016-06-20.
 */
public class NoCoinState implements State {
    @Override
    public void increaseCoin(int coin, VendingMachine vm) {
        vm.increseCoin(coin);

    }

    @Override
    public void select(int productId, VendingMachine vm) {

    }

    @Override
    public boolean isSelecatable() {
        return false;
    }
}
