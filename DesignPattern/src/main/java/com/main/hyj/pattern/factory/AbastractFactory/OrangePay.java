package com.main.hyj.pattern.factory.AbastractFactory;

import com.main.hyj.pattern.factory.IPayMoney;

/**
 * create by flytohyj  2019/7/13
 **/
public class OrangePay implements IPayMoney {

    @Override
    public void pay() {
        System.out.println("付橘子钱给商家");
    }
}
