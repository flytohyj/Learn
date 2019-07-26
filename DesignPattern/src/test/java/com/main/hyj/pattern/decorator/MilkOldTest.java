package com.main.hyj.pattern.decorator;

import com.main.hyj.pattern.decorator.milkOld.Milk;
import com.main.hyj.pattern.decorator.milkOld.MilkWithEgg;
import com.main.hyj.pattern.decorator.milkOld.MilkWithEggAndNut;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/25
 **/
public class MilkOldTest {

    @Test
    public void decortorTest(){
        Milk milk = new Milk();
        System.out.println("早餐"+milk.getMsg()+"价钱"+milk.getPrice());

        Milk milkWithEgg = new MilkWithEgg();
        System.out.println("早餐"+milkWithEgg.getMsg()+"价钱"+milkWithEgg.getPrice());

        Milk milkWithEggAndNut = new MilkWithEggAndNut();
        System.out.println("早餐"+milkWithEggAndNut.getMsg()+"价钱"+milkWithEggAndNut.getPrice());
    }
}
