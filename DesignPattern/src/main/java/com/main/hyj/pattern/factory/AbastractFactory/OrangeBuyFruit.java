package com.main.hyj.pattern.factory.AbastractFactory;

import com.main.hyj.pattern.factory.IFruit;

/**
 * create by flytohyj  2019/7/13
 **/
public class OrangeBuyFruit implements IFruit {

    @Override
    public void BuyFruit() {
        System.out.println("挑选购买橘子");
    }
}
