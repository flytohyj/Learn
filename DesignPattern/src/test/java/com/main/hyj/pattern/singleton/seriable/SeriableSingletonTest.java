package com.main.hyj.pattern.singleton.seriable;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * create by flytohyj  2019/7/14
 **/
public class SeriableSingletonTest {

    @Test
   public void SeriableTest(){
       SeriableSingleton s1 = null;
       SeriableSingleton s2 = SeriableSingleton.getInstance();
       FileOutputStream fos = null;
       try {
           fos = new FileOutputStream("SeriableSingleton.obj");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(s2);
           oos.flush();
           oos.close();
           FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
           ObjectInputStream ois = new ObjectInputStream(fis);
           s1 = (SeriableSingleton)ois.readObject();
           ois.close();
           System.out.println(s1);
           System.out.println(s2);
           System.out.println(s1 == s2);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
