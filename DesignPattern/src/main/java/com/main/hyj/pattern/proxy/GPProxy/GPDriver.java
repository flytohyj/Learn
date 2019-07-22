package com.main.hyj.pattern.proxy.GPProxy;

import java.lang.reflect.Method;

/**
 * create by flytohyj  2019/7/21
 **/
public class GPDriver implements GPInvocationHandler {

    //被代理的对象，把引用给保存下来
    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }
    private void before(){
        System.out.println("我是司机：我要送到目的地，现在已经载到顾客了");
        System.out.println("开始开车送顾客");
    }
    private void after(){
        System.out.println("马上送到目的地收费");
    }
}
