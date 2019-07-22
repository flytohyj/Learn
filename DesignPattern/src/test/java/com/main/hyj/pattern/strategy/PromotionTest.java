package com.main.hyj.pattern.strategy;

import com.main.hyj.pattern.strategy.gp.*;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/22
 **/
public class PromotionTest {

    @Test
    public void promotionTest(){
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
        activity618.execute();
        activity1111.execute();
    }

    @Test
    public void promotionATest(){
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if("COUPON".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if("CASHBACK".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }else if("GROUP".equals(promotionKey)){
            promotionActivity = new PromotionActivity(new GroupbuyStrategy());
        }else{
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }
        promotionActivity.execute();
    }


    @Test
    public void promotionFactoryTest(){
        String promotionKey = "GROUP";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
