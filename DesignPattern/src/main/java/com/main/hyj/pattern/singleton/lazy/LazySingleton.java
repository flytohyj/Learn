package com.main.hyj.pattern.singleton.lazy;

/**
 * create by flytohyj  2019/7/14
 *  懒汉式单例模式
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public synchronized  static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
