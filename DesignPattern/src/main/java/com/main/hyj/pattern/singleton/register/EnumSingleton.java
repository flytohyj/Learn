package com.main.hyj.pattern.singleton.register;

/**
 * create by flytohyj  2019/7/14
 * 枚举类型
 **/
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}
