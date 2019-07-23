package com.main.hyj.pattern.adapter.login;

import com.main.hyj.pattern.template.jdbc.Member;

/**
 * create by flytohyj  2019/7/23
 **/
public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
