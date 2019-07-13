package com.main.hyj.pattern.factory.FatoryMethod;

import com.main.hyj.pattern.factory.IFruit;

/**
 * create by flytohyj  2019/7/13
 **/
public class TestFruit {

    public static void main(String[] args){
        IFruitFactory iFruitFactory = new AppleFactory();
        IFruit fruit = iFruitFactory.createFruit();
        fruit.BuyFruit();

        iFruitFactory = new BananerFactory();
        fruit = iFruitFactory.createFruit();
        fruit.BuyFruit();
    }
}
