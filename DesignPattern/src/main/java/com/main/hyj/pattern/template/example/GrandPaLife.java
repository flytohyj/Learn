package com.main.hyj.pattern.template.example;

/**
 * create by flytohyj  2019/7/23
 **/
public class GrandPaLife  extends FamilyLife{

    private boolean needworkFlag = false;

    public GrandPaLife(boolean needworkFlag) {
        this.needworkFlag = needworkFlag;
    }


    @Override
    void work() {
        System.out.println("在家带孩子");
    }

    @Override
    public boolean needwork() {
        return this.needworkFlag;
    }
}
