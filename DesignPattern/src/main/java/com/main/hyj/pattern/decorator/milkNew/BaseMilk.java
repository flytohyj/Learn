package com.main.hyj.pattern.decorator.milkNew;

/**
 * create by flytohyj  2019/7/25
 **/
public class BaseMilk extends Milk {
    @Override
    public String getMsg() {
        return "牛奶";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
