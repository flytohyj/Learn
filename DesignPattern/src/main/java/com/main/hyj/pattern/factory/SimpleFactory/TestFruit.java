package com.main.hyj.pattern.factory.SimpleFactory;

import com.main.hyj.pattern.factory.AppleFruit;
import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.OrangeFruit;

/**
 * create by flytohyj  2019/7/13
 * 测试类
 **/
public class TestFruit {

    public static void main(String args[]){
        IFruit fruit = new AppleFruit();
        fruit.BuyFruit();

        FruitFactory fruitFactory = new FruitFactory();
        IFruit iFruit =fruitFactory.createFruitByStr("apple");
        iFruit.BuyFruit();


        IFruit iFruitA =fruitFactory.createFruitByClassName("com.main.hyj.pattern.factory.BananerFruit");
        iFruitA.BuyFruit();

        IFruit iFruitOrange =fruitFactory.createFruitByClass(OrangeFruit.class);
        iFruitOrange.BuyFruit();


    }
}
