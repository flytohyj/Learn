package com.main.hyj.pattern.singleton.lazy;

/**
 * create by flytohyj  2019/7/14
 **/
public class LazyInnerThread implements Runnable {

    @Override
    public void run() {
        LazyInnerClassSingleton lazyInnerClassSingleton  = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":" + lazyInnerClassSingleton);
    }
}
