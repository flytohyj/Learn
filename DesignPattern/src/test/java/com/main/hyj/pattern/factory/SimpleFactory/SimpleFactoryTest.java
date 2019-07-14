package com.main.hyj.pattern.factory.SimpleFactory;

import com.main.hyj.pattern.factory.AppleFruit;
import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.OrangeFruit;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/13
 **/
public class SimpleFactoryTest {

    @Test
    public void TestFruit() {
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
