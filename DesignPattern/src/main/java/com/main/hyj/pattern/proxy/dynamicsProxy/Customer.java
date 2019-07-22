package com.main.hyj.pattern.proxy.dynamicsProxy;

import com.main.hyj.pattern.proxy.staticProxy.Passenger;

/**
 * create by flytohyj  2019/7/21
 **/
public class Customer implements Passenger {

    @Override
    public void toDestination() {
        System.out.println("舒适……舒适");
        System.out.println("豪华……");
        System.out.println("我要去非洲大草原");
    }
}
