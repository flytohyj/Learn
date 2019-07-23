package com.main.hyj.pattern.adapter.login;

/**
 * create by flytohyj  2019/7/23
 **/
public interface LoginAdapter {

    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);

}
