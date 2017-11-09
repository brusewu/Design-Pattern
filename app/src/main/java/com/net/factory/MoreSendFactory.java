package com.net.factory;

/**
 * Created by wuxiaolong on 2017/10/24.
 */

public class MoreSendFactory {

    public Sender produceMail(){
        return new MailSender();
    }
    public Sender produceSms(){
        return new SmsSender();
    }
}
