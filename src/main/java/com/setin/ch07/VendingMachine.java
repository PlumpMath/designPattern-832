package com.setin.ch07;

/**
 * Created by 두석 on 2016-06-20.
 */
public class VendingMachine {
    public static enum State {NOCOIN, SELECTABLE, SOLDOUT} //기능 추가}

    public State state = State.NOCOIN;

    public void insertCoin(int coin) {
        switch (state) {
            case NOCOIN:
                increseCoin(coin);
                state = State.SELECTABLE;
                break;
            case SELECTABLE:
                increseCoin(coin);
                break;
            case SOLDOUT:
                returnCoin();
                break;
            default:
                System.out.println("이 상태로 들어오면 안됩니다.");
        }
    }

    private void returnCoin() {
    }

    public void select(int productId) {
        switch (state) {
            case NOCOIN:
                break;
            case SELECTABLE:
                productId(productId);
                decreseCoin();
                if (hasNoCoin()) {
                    state = State.NOCOIN;
                }
        }
    }

    private boolean hasNoCoin() {
        return false;
    }

    private void decreseCoin() {
    }

    private void productId(int productId) {
    }

    private void increseCoin(int coin) {
    }
}
