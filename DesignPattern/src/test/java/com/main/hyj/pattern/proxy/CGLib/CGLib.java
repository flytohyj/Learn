package com.main.hyj.pattern.proxy.CGLib;

import net.sf.cglib.core.DebuggingClassWriter;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/22
 **/
public class CGLib {

    @Test
    public void CGLibTest(){
        try {
            //利用cglib 的代理类可以将内存中的class 文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                    "E://cglib_proxy_class/");
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
