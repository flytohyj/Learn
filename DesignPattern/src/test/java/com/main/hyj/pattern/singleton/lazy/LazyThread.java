package com.main.hyj.pattern.singleton.lazy;

/**
 * create by flytohyj  2019/7/14
 **/
public class LazyThread implements Runnable {

    @Override
    public void run() {
        LazySingleton lazySingleton  = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":" + lazySingleton);
    }
}
