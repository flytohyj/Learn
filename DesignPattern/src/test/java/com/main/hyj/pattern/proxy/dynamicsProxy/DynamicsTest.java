package com.main.hyj.pattern.proxy.dynamicsProxy;

import com.main.hyj.pattern.proxy.GPProxy.GPDriver;
import com.main.hyj.pattern.proxy.example.IOrderService;
import com.main.hyj.pattern.proxy.example.Order;
import com.main.hyj.pattern.proxy.example.OrderService;
import com.main.hyj.pattern.proxy.staticProxy.Passenger;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by flytohyj  2019/7/21
 **/
public class DynamicsTest {

    @Test
    public void JDKDriverTest(){
        try {
            Passenger passenger = (Passenger)new JDKDriver().getInstance(new Customer());
            passenger.toDestination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void OrderServiceDynamicProxyTest(){
        try{
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);

        }catch (Exception e){

        }
    }


    @Test
    public void GPDynamicProxyTest(){
        try{
            Passenger passenger = (Passenger) new GPDriver().getInstance(new Customer());
            System.out.println(passenger.getClass());
            passenger.toDestination();

        }catch (Exception e){

        }
    }
}
