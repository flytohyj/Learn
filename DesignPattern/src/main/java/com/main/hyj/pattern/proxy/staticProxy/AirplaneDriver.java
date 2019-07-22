package com.main.hyj.pattern.proxy.staticProxy;

/**
 * create by flytohyj  2019/7/21
 * 飞机
 **/
public class AirplaneDriver {

    private Boy boy;

    //没办法扩展
    //只能帮助男孩
    public AirplaneDriver(Boy boy){
        this.boy = boy;
    }

    public void toDestination() {
        System.out.println("飞行员帮男孩买票，航空允许飞行");
        this.boy.toDestination();
        System.out.println("开飞机带男孩去北京游玩");
    }

}
