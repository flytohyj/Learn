package com.main.hyj.pattern.adapter;

import com.main.hyj.pattern.adapter.login.SigninForThirdService;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/23
 **/
public class SigninForThirdServiceTest {

    @Test
    public void thirdServiceTest(){
        SigninForThirdService service = new SigninForThirdService();
        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");
    }
}
