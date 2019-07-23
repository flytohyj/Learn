package com.main.hyj.pattern.adapter;

import com.main.hyj.pattern.adapter.login.IPassportForThird;
import com.main.hyj.pattern.adapter.login.PassportForThirdAdapter;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/23
 **/
public class PassportTest {

    @Test
    public  void passportAdapterTest() {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
