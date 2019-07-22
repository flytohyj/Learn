package com.main.hyj.pattern.strategy.gp;

/**
 * create by flytohyj  2019/7/22
 **/
public class GroupbuyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("拼团，满20 人成团，全团享受团购价");
    }
}
