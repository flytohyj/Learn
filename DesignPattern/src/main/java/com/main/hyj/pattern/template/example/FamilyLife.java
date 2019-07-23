package com.main.hyj.pattern.template.example;

/**
 * create by flytohyj  2019/7/23
 * 家人一天的生活
 * 模板会有一个或者多个未现实方法，
 * * 而且这几个未实现方法有固定的执行循序
 **/
public abstract class FamilyLife {

    public final void createLife(){
        //1.起床
        this.getUp();

        //2.刷牙洗脸
        this.wash();

        //3.吃早饭
        this.breakfast();

        //4.出门
        this.goOut();

        //5 是否需要工作
        if(needwork()){
            this.work();
        }
        System.out.println("\r\n");
    }

    abstract void  work();

    //钩子方法：实现流程的微调
    protected  boolean needwork(){
        return false;
    }

    final void getUp(){
        System.out.printf("早上起床~~~~");
    }

    final void wash(){
        System.out.printf("刷牙洗脸~~~~");
    }

    final void breakfast(){
        System.out.printf("吃早饭");
    }

    final void goOut(){
        System.out.printf("出门");
    }
}
