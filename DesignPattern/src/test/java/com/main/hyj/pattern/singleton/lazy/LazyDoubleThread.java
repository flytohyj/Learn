package com.main.hyj.pattern.singleton.lazy;

/**
 * create by flytohyj  2019/7/14
 **/
public class LazyDoubleThread implements Runnable {

    @Override
    public void run() {
        LazyDoubleSingleton lazyDoubleSingleton  = LazyDoubleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":" + lazyDoubleSingleton);
    }
}
