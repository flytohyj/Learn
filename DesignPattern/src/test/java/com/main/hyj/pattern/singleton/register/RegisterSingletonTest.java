package com.main.hyj.pattern.singleton.register;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * create by flytohyj  2019/7/14
 *
 **/
public class RegisterSingletonTest {

    @Test
    public void  EnumTest() throws Exception{
        EnumSingleton instance1 = null;
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance2.setData(new Object());
        FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance2);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance1 = (EnumSingleton) ois.readObject();
        ois.close();
        System.out.println(instance1.getData());
        System.out.println(instance2.getData());
        System.out.println(instance1.getData() == instance2.getData());
    }
}
