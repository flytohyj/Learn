package com.main.hyj.pattern.prototype;

import java.io.*;

/**
 * create by flytohyj  2019/7/19
 **/
public class ColoneSheep  extends SheepA implements  Cloneable, Serializable {

    public Food food;
    public ColoneSheep(){
        //只是初始化
        this.color ="黑色";
        this.sex = "母羊";
        this.food = new Food();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    //深度复制
    public Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ColoneSheep copy = (ColoneSheep)ois.readObject();
            copy.sex = "公羊";
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //浅克隆
    public ColoneSheep shallowClone(ColoneSheep target){
        ColoneSheep coloneSheep = new ColoneSheep();
        coloneSheep.color = target.color;
        coloneSheep.food = target.food;
        coloneSheep.sex = target.sex;
        coloneSheep.legs = target.legs;
        return coloneSheep;
    }
}
