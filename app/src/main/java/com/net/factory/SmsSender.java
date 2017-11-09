package com.net.factory;

/**
 * Created by wuxiaolong on 2017/10/24.
 */

public class SmsSender implements Sender {

    @Override
    public void send(){
        System.out.println("this is smsSender");
    }
}
