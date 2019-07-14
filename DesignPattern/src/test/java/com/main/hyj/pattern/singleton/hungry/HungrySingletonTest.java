package com.main.hyj.pattern.singleton.hungry;

import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/14
 **/
public class HungrySingletonTest {

    @Test
    public void Test(){
        Thread t1 = new Thread(new HungryExectorThread());
        Thread t2 = new Thread(new HungryExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
