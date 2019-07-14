package com.main.hyj.pattern.singleton.lazy;

/**
 * create by flytohyj  2019/7/14
 **/
public class LazyDoubleSingleton {

    private volatile static LazyDoubleSingleton lazy = null;

    private LazyDoubleSingleton() {
    }

    public static LazyDoubleSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleSingleton();
                }
            }
        }
        return lazy;
    }
}
