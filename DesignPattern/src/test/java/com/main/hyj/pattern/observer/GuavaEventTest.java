package com.main.hyj.pattern.observer;

import com.google.common.eventbus.EventBus;
import com.main.hyj.pattern.observer.guava.GuavaAction;
import com.main.hyj.pattern.observer.guava.GuavaEvent;
import org.junit.jupiter.api.Test;

/**
 * create by flytohyj  2019/7/26
 **/
public class GuavaEventTest {

    @Test
    public void GuavaEventTest(){
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        GuavaAction action = new GuavaAction();
        eventbus.register(action);
        eventbus.post("Tom");
    }
}
