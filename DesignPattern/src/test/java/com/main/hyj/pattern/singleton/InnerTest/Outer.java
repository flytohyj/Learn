package com.main.hyj.pattern.singleton.InnerTest;

/**
 * create by flytohyj  2019/7/18
 **/
public class Outer {
    static {
        System.out.println("load outer class..static.");
    }
    {
        System.out.println("load outer class........");
    }
    //静态内部类
    static class StaticInner {
        static {
            System.out.println("load StaticInner static class...");
        }
        {
            System.out.println("load StaticInner ...");
        }
        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("===========分割线===========");
        Outer.StaticInner.staticInnerMethod();      //调用内部类的静态方法
    }
}
