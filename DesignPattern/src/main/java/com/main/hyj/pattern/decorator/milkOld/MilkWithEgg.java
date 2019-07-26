package com.main.hyj.pattern.decorator.milkOld;

/**
 * create by flytohyj  2019/7/25
 * 牛奶带鸡蛋
 **/
public class MilkWithEgg  extends Milk{

    @Override
    public String getMsg(){
        return super.getMsg()+"加一个鸡蛋";
    }

    @Override
    //加一个鸡蛋加一元钱
    public int getPrice(){
        return super.getPrice()+ 1;
    }
}
