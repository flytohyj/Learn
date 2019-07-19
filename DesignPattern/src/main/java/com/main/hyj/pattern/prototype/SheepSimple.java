package com.main.hyj.pattern.prototype;

import java.util.List;

/**
 * create by flytohyj  2019/7/19
 **/
public class SheepSimple implements Prototype{

    public String color;
    public String sex;
    public List legs;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List getLegs() {
        return legs;
    }

    public void setLegs(List legs) {
        this.legs = legs;
    }

    @Override
    public SheepSimple clone() {
        SheepSimple sheep = new SheepSimple();
        sheep.setColor(this.color);
        sheep.setSex(this.sex);
        sheep.setLegs(this.legs);
        return sheep;
    }
}
