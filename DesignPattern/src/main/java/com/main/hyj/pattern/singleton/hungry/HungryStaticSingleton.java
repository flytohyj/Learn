package com.main.hyj.pattern.singleton.hungry;

/**
 * create by flytohyj  2019/7/14
 **/
public class HungryStaticSingleton {

    private static HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return instance;
    }
}
