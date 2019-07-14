package com.main.hyj.pattern.factory.FatoryMethod;

import com.main.hyj.pattern.factory.IFruit;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/14
 **/
public class FactoryMethodTest {

    @Test
    public void TestFruit() {
        IFruitFactory iFruitFactory = new AppleFactory();
        IFruit fruit = iFruitFactory.createFruit();
        fruit.BuyFruit();

        iFruitFactory = new BananerFactory();
        fruit = iFruitFactory.createFruit();
        fruit.BuyFruit();
    }
}
