package com.main.hyj.pattern.singleton.lazy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * create by flytohyj  2019/7/14
 **/
public class LazySingletonTest {

    @Test
    public void Test() {
        Thread t1 = new Thread(new LazyThread());
        Thread t2 = new Thread(new LazyThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }

    @Test
    public void LazyDoubleTest() {
        Thread t1 = new Thread(new LazyDoubleThread());
        Thread t2 = new Thread(new LazyDoubleThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }

    @Test
    public void LazyInnerTest() {
        Thread t1 = new Thread(new LazyInnerThread());
        Thread t2 = new Thread(new LazyInnerThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }

    /**
     * 反射破坏
     */
    @Test
    public void invokeInnerTest() {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();
            //调用了两次构造方法，相当于new 了两次
            //犯了原则性问题，
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
            // Object o2 = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //序列化破坏单例
    @Test
    public void seriableInnerTest() {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);
            //暴力初始化
            Object o1 = c.newInstance();
            //调用了两次构造方法，相当于new 了两次
            //犯了原则性问题，
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
            // Object o2 = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
