package com.main.hyj.pattern.template.example;

/**
 * create by flytohyj  2019/7/23
 **/
public class MonLife extends FamilyLife {

    private boolean needworkFlag = false;

    public MonLife(boolean needworkFlag) {
        this.needworkFlag = needworkFlag;
    }

    @Override
    void work() {
        System.out.println("上班去工作--外贸");
    }


    protected boolean needwork() {
        return this.needworkFlag;
    }
}
