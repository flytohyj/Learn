package com.main.hyj.pattern.proxy.JDKProxy;

import com.main.hyj.pattern.proxy.dynamicsProxy.Customer;
import com.main.hyj.pattern.proxy.dynamicsProxy.JDKDriver;
import com.main.hyj.pattern.proxy.staticProxy.Passenger;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * create by flytohyj  2019/7/21
 **/
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Passenger obj = (Passenger)new JDKDriver().getInstance(new Customer());
            obj.toDestination();
            //通过反编译工具可以查看源代码
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Passenger.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
