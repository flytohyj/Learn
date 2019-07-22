package com.main.hyj.pattern.strategy.pay;

/**
 * create by flytohyj  2019/7/22
 **/
public class PayState {

    private int code;
    private Object data;
    private String msg;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }


    public String toString() {
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }

}
