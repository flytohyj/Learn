package com.main.hyj.pattern.strategy.pay;

/**
 * create by flytohyj  2019/7/22
 **/
public class JDPay extends  Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
