package com.net.abstractFactory;

import com.net.factory.Sender;

/**
 * Created by wuxiaolong on 2017/10/25.
 */

public class AmailSender implements Sender {
    @Override
    public void send(){
        System.out.println("this is mail");
    }
}
