package com.main.hyj.pattern.strategy.gp;

/**
 * create by flytohyj  2019/7/22
 **/
public class CashbackStrategy  implements  PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
