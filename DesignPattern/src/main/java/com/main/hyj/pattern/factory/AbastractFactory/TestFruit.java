package com.main.hyj.pattern.factory.AbastractFactory;

/**
 * create by flytohyj  2019/7/13
 **/
public class TestFruit {

    public static void main(String[] args){
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
