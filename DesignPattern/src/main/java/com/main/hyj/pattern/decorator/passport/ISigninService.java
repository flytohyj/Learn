package com.main.hyj.pattern.decorator.passport;

/**
 * create by flytohyj  2019/7/25
 **/
public interface ISigninService {

    ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
