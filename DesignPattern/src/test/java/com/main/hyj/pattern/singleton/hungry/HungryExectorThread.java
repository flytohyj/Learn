package com.main.hyj.pattern.singleton.hungry;

/**
 * create by flytohyj  2019/7/14
 **/
public class HungryExectorThread implements Runnable {
    @Override
    public void run() {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":" + hungrySingleton);
    }
}
