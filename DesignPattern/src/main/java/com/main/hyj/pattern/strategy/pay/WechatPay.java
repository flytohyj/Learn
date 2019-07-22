package com.main.hyj.pattern.strategy.pay;

/**
 * create by flytohyj  2019/7/22
 **/
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
