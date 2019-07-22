package com.main.hyj.pattern.proxy.dynamicsProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by flytohyj  2019/7/21
 **/
public class JDKDriver implements InvocationHandler {

    //被代理的对象，把引用给保存下来
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是司机：我要送到目的地，现在已经载到顾客了");
        System.out.println("开始开车送顾客");
    }

    private void after(){
        System.out.println("马上送到目的地收费");
    }
}
