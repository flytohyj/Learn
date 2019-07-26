package com.main.hyj.pattern.decorator;

import com.main.hyj.pattern.decorator.passport.ISigninForThirdService;
import com.main.hyj.pattern.decorator.passport.SigninForThirdService;
import com.main.hyj.pattern.decorator.passport.SigninService;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/25
 **/
public class PassportTest {

    @Test
    public void decortorTest() {
        ISigninForThirdService signinForThirdService = new SigninForThirdService(new SigninService());
        signinForThirdService.loginForQQ("xdcdfswrwsdfssdfqsdf");
        //为某个类实现动态增加或者覆盖原有方法的情况，采用装饰器模式
    }
}
