package com.main.hyj.pattern.singleton.ThreadLocal;

import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/14
 **/
public class ThreadLocalSingletonTest {

    @Test
    public void ThreadLocalTest(){
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println("End");

        Thread t1 = new Thread(new ThreadLocalExectorThread());
        Thread t2 = new Thread(new ThreadLocalExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
