package com.main.hyj.pattern.proxy.GPProxy;

import java.lang.reflect.Method;

/**
 * create by flytohyj  2019/7/21
 **/
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
