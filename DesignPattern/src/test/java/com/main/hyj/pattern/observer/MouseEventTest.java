package com.main.hyj.pattern.observer;

import com.main.hyj.pattern.observer.events.mouseevent.Mouse;
import com.main.hyj.pattern.observer.events.mouseevent.MouseEventCallback;
import com.main.hyj.pattern.observer.events.mouseevent.MouseEventType;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/25
 **/
public class MouseEventTest {

    @Test
    public void mouseEventTest(){
        try {
            MouseEventCallback callback = new MouseEventCallback();
            //注册事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK, callback);
            mouse.addLisenter(MouseEventType.ON_MOVE, callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
            mouse.addLisenter(MouseEventType.ON_OVER, callback);
            //调用方法
            mouse.click();
            //失焦事件
            mouse.blur();
        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
