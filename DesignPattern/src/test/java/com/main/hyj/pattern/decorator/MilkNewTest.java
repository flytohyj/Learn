package com.main.hyj.pattern.decorator;


import com.main.hyj.pattern.decorator.milkNew.BaseMilk;
import com.main.hyj.pattern.decorator.milkNew.EggDecorator;
import com.main.hyj.pattern.decorator.milkNew.Milk;
import com.main.hyj.pattern.decorator.milkNew.NutDecorator;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/25
 **/
public class MilkNewTest {

    @Test
    public void decortorTest(){
        Milk milk ;
        milk = new BaseMilk();
        System.out.println("早餐"+milk.getMsg()+"价钱"+milk.getPrice());

        milk = new EggDecorator(milk);
        System.out.println("早餐"+milk.getMsg()+"价钱"+milk.getPrice());

        milk = new EggDecorator(milk);
        System.out.println("早餐"+milk.getMsg()+"价钱"+milk.getPrice());

        //跟静态代理最大区别就是职责不同
        //静态代理不一定要满足is-a 的关系
        //静态代理会做功能增强，同一个职责变得不一样
        //装饰器更多考虑是扩展
        milk = new NutDecorator(milk);
        System.out.println("早餐"+milk.getMsg()+"价钱"+milk.getPrice());
    }
}
