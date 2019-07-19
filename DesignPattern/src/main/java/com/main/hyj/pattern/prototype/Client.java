package com.main.hyj.pattern.prototype;

/**
 * create by flytohyj  2019/7/19
 **/
public class Client {

    public Prototype startClone(Prototype concretePrototype){
        return (Prototype)concretePrototype.clone();
    }
}
