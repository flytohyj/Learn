package com.main.hyj.pattern.prototype;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * create by flytohyj  2019/7/19
 **/
public class PrototypeTest {

    @Test
    public void testPrototype() {
        // 创建一个具体的需要克隆的对象
        SheepSimple sheep = new SheepSimple();
        // 填充属性，方便测试
        sheep.setColor("白色");
        sheep.setSex("公羊");
        List legs = new ArrayList<String>();
        sheep.setLegs(legs);
        System.out.println(sheep);

        // 创建Client 对象，准备开始克隆
        Client client = new Client();
        SheepSimple sheepColone = (SheepSimple) client.startClone(sheep);
        System.out.println(sheepColone);
        System.out.println("克隆对象中的引用类型地址值：" + sheepColone.getLegs());
        System.out.println("原对象中的引用类型地址值：" + sheep.getLegs());
        //复制的不是值，而是引用的地址。浅克隆
        System.out.println("对象地址比较：" + (sheepColone.getLegs() == sheep.getLegs()));
    }

    @Test
    public void testPrototypeDeep() {
        ColoneSheep coloneSheep = new ColoneSheep();
        try {
            ColoneSheep clone = (ColoneSheep)coloneSheep.clone();
            System.out.println("深克隆：" + (coloneSheep.food == clone.food));
        } catch (Exception e) {
            e.printStackTrace();
        }
        ColoneSheep q = new ColoneSheep();
        ColoneSheep n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.food == n.food));
    }
}
