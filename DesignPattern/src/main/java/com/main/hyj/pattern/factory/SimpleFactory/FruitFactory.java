package com.main.hyj.pattern.factory.SimpleFactory;


import com.main.hyj.pattern.factory.AppleFruit;
import com.main.hyj.pattern.factory.BananerFruit;
import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.OrangeFruit;

/**
 * create by flytohyj  2019/7/13
 **/
public class FruitFactory {

    public IFruit createFruitByStr(String fruit) {
        IFruit iFruit = null;
        switch (fruit) {
            case "apple":
                iFruit = new AppleFruit();
                break;
            case "bananer":
                iFruit = new BananerFruit();
                break;
            case "orange":
                iFruit = new OrangeFruit();
                break;
            default:
                iFruit = null;
                break;
        }
        return iFruit;

    }

    public IFruit createFruitByClassName(String className) {
        try {
            if (className != null && !"".equals(className.trim())) {
                return (IFruit) Class.forName(className).newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public IFruit createFruitByClass(Class<? extends IFruit> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
