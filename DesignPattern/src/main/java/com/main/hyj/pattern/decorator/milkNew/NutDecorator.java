package com.main.hyj.pattern.decorator.milkNew;

/**
 * create by flytohyj  2019/7/25
 **/
public class NutDecorator extends MilkDecorator {


    public NutDecorator(Milk milk) {
        super(milk);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public String getMsg() {
        return super.getMsg() + "+1 包坚果";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3;
    }
}
