package com.main.hyj.pattern.adapter.login;

/**
 * create by flytohyj  2019/7/23
 **/
public class LoginForTokenAdapter implements LoginAdapter{

    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }

}
