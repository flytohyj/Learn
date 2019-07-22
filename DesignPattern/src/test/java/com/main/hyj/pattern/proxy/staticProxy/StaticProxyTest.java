package com.main.hyj.pattern.proxy.staticProxy;

import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/21
 **/
public class StaticProxyTest {

    @Test
    public void passengerTest(){

        AirplaneDriver airplaneDriver = new AirplaneDriver(new Boy());
        airplaneDriver.toDestination();
    }
}
