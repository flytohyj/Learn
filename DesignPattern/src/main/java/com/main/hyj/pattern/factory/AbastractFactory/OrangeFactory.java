package com.main.hyj.pattern.factory.AbastractFactory;

import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.IPayMoney;

/**
 * create by flytohyj  2019/7/13
 **/
public class OrangeFactory implements FruitFactory {
    @Override
    public IFruit CreateFruit() {
        return new OrangeBuyFruit();
    }

    @Override
    public IPayMoney payMoney() {
        return new OrangePay();
    }
}
