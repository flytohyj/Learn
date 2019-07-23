package com.main.hyj.pattern.adapter.login;

/**
 * create by flytohyj  2019/7/23
 **/
public class LoginForWechatAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
