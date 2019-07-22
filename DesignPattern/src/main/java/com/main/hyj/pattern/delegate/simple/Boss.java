package com.main.hyj.pattern.delegate.simple;

/**
 * create by flytohyj  2019/7/22
 **/
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}
