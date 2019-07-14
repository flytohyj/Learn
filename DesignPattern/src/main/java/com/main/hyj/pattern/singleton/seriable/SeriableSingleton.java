package com.main.hyj.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * create by flytohyj  2019/7/14
 **/
public class SeriableSingleton implements Serializable {

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO 流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了
    //反序列化
    //讲已经持久化的字节码内容，转换为IO 流
    //通过IO 流的读取，进而将读取的内容转换为Java 对象
    //在转换过程中会重新创建对象new
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
