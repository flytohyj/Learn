package com.main.hyj.pattern.observer.weather;

import java.util.Observable;
import java.util.Observer;

/**
 * create by flytohyj  2019/7/25
 * 农场订阅了天气预报
 **/
public class School implements Observer {

    private String name;

    public School(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object arg) {
        WeatherForecast weatherForecast = (WeatherForecast) observable;
        Weather weather = (Weather) arg;
        System.out.println("===============================");
        System.out.println(name + "你好！\n" +
                "您收到了一个“" + weatherForecast.getName() + "”，内容如下：\n" +
                weather.getContent() + "\n" +
                "预报时间：" + weather.getDate());

    }
}

