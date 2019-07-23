package com.main.hyj.pattern.adapter.login;

/**
 * create by flytohyj  2019/7/23
 **/
public interface IPassportForThird {

    /**
     * QQ 登录
     * @param id
     * @return
    咕泡出品，必属精品www.gupaoedu.com
    23
     */
    ResultMsg loginForQQ(String id);
    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);

}
