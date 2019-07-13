package com.main.hyj.pattern.factory.AbastractFactory;

import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.IPayMoney;

/**
 * 抽象工厂是用户的主入口
 * 在Spring 中应用得最为广泛的一种设计模式
 * 易于扩展
 * create by flytohyj  2019/7/13
 **/
public interface FruitFactory {

    /**
     * 挑选水果
     * @return
     */
    IFruit CreateFruit();

    /**
     * 付钱
     * @return
     */
    IPayMoney payMoney();

}
