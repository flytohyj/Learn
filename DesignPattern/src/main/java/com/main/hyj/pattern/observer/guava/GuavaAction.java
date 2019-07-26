package com.main.hyj.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * create by flytohyj  2019/7/26
 **/
public class GuavaAction {

    @Subscribe
    public void subscribe(String str) {
        //业务逻辑
        System.out.println("执行GuavaAction 方法,传入的参数是:" + str);
    }

}
