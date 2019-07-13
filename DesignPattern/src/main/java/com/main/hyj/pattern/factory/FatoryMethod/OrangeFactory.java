package com.main.hyj.pattern.factory.FatoryMethod;

import com.main.hyj.pattern.factory.IFruit;
import com.main.hyj.pattern.factory.OrangeFruit;

/**
 * create by flytohyj  2019/7/13
 **/
public class OrangeFactory implements IFruitFactory {
    @Override
    public IFruit createFruit() {
        return new OrangeFruit();
    }
}
