package com.main.hyj.pattern.adapter;

import com.main.hyj.pattern.adapter.objectadapter.AC220;
import com.main.hyj.pattern.adapter.objectadapter.DC5;
import com.main.hyj.pattern.adapter.objectadapter.PowerAdapter;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/23
 **/
public class ObjectAdapterTest {

    @Test
    public  void adapterTest() {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }

}
