package com.main.hyj.pattern.template.example;

/**
 * create by flytohyj  2019/7/23
 **/
public class DadLife  extends FamilyLife{

    private boolean needworkFlag = true;

    public DadLife(boolean needworkFlag) {
        this.needworkFlag = needworkFlag;
    }

    @Override
    void work() {
        System.out.println("上班去工作--IT");
    }

    @Override
    protected boolean needwork() {
        return this.needworkFlag;
    }
}
