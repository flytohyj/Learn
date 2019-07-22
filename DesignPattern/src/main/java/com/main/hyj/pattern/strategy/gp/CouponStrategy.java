package com.main.hyj.pattern.strategy.gp;

/**
 * create by flytohyj  2019/7/22
 **/
public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
