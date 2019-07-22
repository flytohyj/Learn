package com.main.hyj.pattern.strategy.pay;

/**
 * create by flytohyj  2019/7/22
 **/
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
