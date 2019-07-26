package com.main.hyj.pattern.decorator.milkNew;

/**
 * create by flytohyj  2019/7/25
 **/
public abstract class MilkDecorator extends Milk {

    //静态代理，委派
    private Milk milk;

    public MilkDecorator(Milk milk) {
        this.milk = milk;
    }

    protected abstract void doSomething();

    @Override
    public String getMsg() {
        return this.milk.getMsg();
    }

    @Override
    public int getPrice() {
        return this.milk.getPrice();
    }
}
