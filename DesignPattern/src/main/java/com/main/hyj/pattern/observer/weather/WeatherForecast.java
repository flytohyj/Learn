package com.main.hyj.pattern.observer.weather;

import java.util.Observable;

/**
 * create by flytohyj  2019/7/25
 * 天气预报
 **/
public class WeatherForecast extends Observable {
        private String name = "天气预报";
        private static WeatherForecast weather= null;
        private WeatherForecast(){}
        public static WeatherForecast getInstance(){
            if(null == weather){
                weather = new WeatherForecast();
            }
            return weather;
        }
        public String getName() {
            return name;
        }
        public void publishWeather(Weather weather){
            System.out.println(this.name + "在" + weather.getDate() + "时间预报天气"+weather.getContent());
            setChanged();
            notifyObservers(weather);
        }
}
