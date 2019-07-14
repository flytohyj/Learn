package com.main.hyj.pattern.factory.AbastractFactory;

import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/14
 **/
public class AbastractFactoryTest {

    @Test
    public void TestFruit() {
        AppleFactory factory = new AppleFactory();
        factory.CreateFruit().BuyFruit();
        factory.payMoney().pay();

        OrangeFactory orangeFactory = new OrangeFactory();
        orangeFactory.CreateFruit().BuyFruit();
        orangeFactory.payMoney().pay();

        BananerFactory bananerFactory = new BananerFactory();
        bananerFactory.CreateFruit().BuyFruit();
        bananerFactory.payMoney().pay();
    }
}
