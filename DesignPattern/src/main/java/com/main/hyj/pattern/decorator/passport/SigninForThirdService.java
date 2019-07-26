package com.main.hyj.pattern.decorator.passport;

/**
 * create by flytohyj  2019/7/25
 **/
public class SigninForThirdService implements ISigninForThirdService{

    private ISigninService signin;
    public SigninForThirdService(ISigninService iSignin){
        this.signin = signin;
    }


    public ResultMsg regist(String username, String passport){
        return signin.regist(username,passport);
    }
    public ResultMsg login(String username,String passport){
        return signin.login(username,passport);
    }
    public ResultMsg loginForQQ(String id) {
        return null;
    }
    public ResultMsg loginForWechat(String id) {
        return null;
    }
    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
