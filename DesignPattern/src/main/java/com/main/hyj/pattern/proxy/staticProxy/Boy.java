package com.main.hyj.pattern.proxy.staticProxy;

/**
 * create by flytohyj  2019/7/21
 * 男孩要求去
 **/
public class Boy implements Passenger{
    @Override
    public void toDestination() {
        System.out.println("男孩要求：坐飞机去北京游玩");
    }
}
