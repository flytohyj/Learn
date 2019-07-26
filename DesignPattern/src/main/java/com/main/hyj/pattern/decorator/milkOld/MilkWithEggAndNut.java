package com.main.hyj.pattern.decorator.milkOld;

/**
 * create by flytohyj  2019/7/25
 **/
public class MilkWithEggAndNut extends MilkWithEgg {

    @Override
    public String getMsg(){
        return super.getMsg()+"加一包坚果";
    }

    @Override
    //加一个鸡蛋加一元钱
    public int getPrice(){
        return super.getPrice()+ 3;
    }

}
