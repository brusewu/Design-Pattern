package com.net.factory;

/**
 * Created by wuxiaolong on 2017/10/24.
 */

public class MailSender implements Sender {

    @Override
    public void send(){
        System.out.println("this is mailSender");
    }

}
