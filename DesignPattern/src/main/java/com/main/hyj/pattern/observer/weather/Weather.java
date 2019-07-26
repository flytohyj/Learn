package com.main.hyj.pattern.observer.weather;

import java.util.Date;

/**
 * create by flytohyj  2019/7/25
 **/
public class Weather {

    private Date date;
    private String content;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
