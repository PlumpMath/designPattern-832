package com.setin.ch07.상태패턴적용;

/**
 * Created by 두석 on 2016-06-20.
 */
public class VendingMachine {
    private State state;
    public VendingMachine(){
        state = new NoCoinState();
    }

    public void insertCoin(int coin){
        state.increaseCoin(coin, this);
    }

    public void select(int productId){
        state.select(productId, this);
    }

    public void changeState(State newState){
        this.state = newState;
    }

    public void increseCoin(int coin) {
    }

    public void provideProduct(int productId) {

    }

    public void decreseCoin() {
    }

    public boolean hasNoCoin() {
        return false;
    }
}
