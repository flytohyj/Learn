package com.main.hyj.pattern.proxy.example;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by flytohyj  2019/7/21
 **/
public class OrderServiceStaticProxyTest {

    @Test
    public void OrderServiceTest(){
        try {
            Order order = new Order();
            // Date today = new Date();
            // order.setCreateTime(today.getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();;
        }
    }
}
