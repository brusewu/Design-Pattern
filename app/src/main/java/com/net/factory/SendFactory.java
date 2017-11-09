package com.net.factory;

/**
 * Created by wuxiaolong on 2017/10/24.
 */

public class SendFactory {

    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("please input the true!");
            return null;
        }
    }
}
