package com.main.hyj.pattern.singleton.ThreadLocal;

/**
 * create by flytohyj  2019/7/14
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton(){}
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
