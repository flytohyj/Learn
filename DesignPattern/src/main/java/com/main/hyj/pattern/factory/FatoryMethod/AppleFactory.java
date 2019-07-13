package com.main.hyj.pattern.factory.FatoryMethod;

import com.main.hyj.pattern.factory.AppleFruit;
import com.main.hyj.pattern.factory.IFruit;

/**
 * create by flytohyj  2019/7/13
 **/
public class AppleFactory implements IFruitFactory {
    @Override
    public IFruit createFruit() {
        return new AppleFruit();
    }
}
