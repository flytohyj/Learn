package com.main.hyj.pattern.prototype;

import java.io.Serializable;

/**
 * create by flytohyj  2019/7/19
 **/
public class Food implements Serializable {

    public int times=3;//吃的餐数
    public String names="杂草";//食物名字

    public void eat(){
        this.names="嫩草";
        this.times = this.times*2;
    }
}
