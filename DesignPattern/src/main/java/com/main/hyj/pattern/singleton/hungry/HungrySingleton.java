package com.main.hyj.pattern.singleton.hungry;

/**
 * create by flytohyj  2019/7/14
 * 饿汉 单例模式
 **/
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
