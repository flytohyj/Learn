package com.main.hyj.pattern.strategy.gp;

/**
 * create by flytohyj  2019/7/22
 **/
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
