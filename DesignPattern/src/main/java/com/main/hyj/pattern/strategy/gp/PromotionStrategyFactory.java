package com.main.hyj.pattern.strategy.gp;

import java.util.HashMap;
import java.util.Map;

/**
 * create by flytohyj  2019/7/22
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> map = new HashMap<String,PromotionStrategy>();

    static {
        map.put(PromotionKey.COUPON,new CouponStrategy());
        map.put(PromotionKey.CASHBACK,new CashbackStrategy());
        map.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
        map.put(PromotionKey.EMPTY,new EmptyStrategy());
    }

    private  PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = map.get(promotionKey);
        return promotionStrategy == null ? new EmptyStrategy() : promotionStrategy;
    }
    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
        String EMPTY = "EMPTY";
    }
}
