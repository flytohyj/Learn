package com.main.hyj.pattern.proxy.example;

/**
 * create by flytohyj  2019/7/21
 **/
public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao 创建Order 成功!");
        return 1;
    }

}
