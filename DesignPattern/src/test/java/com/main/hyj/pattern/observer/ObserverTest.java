package com.main.hyj.pattern.observer;

import com.main.hyj.pattern.observer.weather.Farm;
import com.main.hyj.pattern.observer.weather.School;
import com.main.hyj.pattern.observer.weather.Weather;
import com.main.hyj.pattern.observer.weather.WeatherForecast;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * create by flytohyj  2019/7/25
 **/
public class ObserverTest {

    @Test
    public void weatherTest(){
        WeatherForecast weatherForecast = WeatherForecast.getInstance();

        Farm farm1 = new Farm("农场主1");
        Farm farm2 = new Farm("农场主2");
        weatherForecast.addObserver(farm1);
        weatherForecast.addObserver(farm2);

        School school1 = new School("学校1");
        School school2 = new School("学校2");
        weatherForecast.addObserver(school1);
        weatherForecast.addObserver(school2);

        Weather weather = new Weather();
        weather.setDate(new Date());
        weather.setContent("今天天气晴朗，适合外出游玩");

        weatherForecast.publishWeather(weather);

    }
}
