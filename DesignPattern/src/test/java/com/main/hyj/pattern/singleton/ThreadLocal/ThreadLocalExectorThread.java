package com.main.hyj.pattern.singleton.ThreadLocal;

/**
 * create by flytohyj  2019/7/14
 **/
public class ThreadLocalExectorThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton  = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":" + threadLocalSingleton);
    }
}
