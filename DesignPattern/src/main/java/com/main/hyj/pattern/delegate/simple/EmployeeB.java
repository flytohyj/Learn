package com.main.hyj.pattern.delegate.simple;

/**
 * create by flytohyj  2019/7/22
 **/
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
