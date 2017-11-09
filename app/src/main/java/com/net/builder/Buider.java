package com.net.builder;

import java.util.ArrayList;
import java.util.List;

import com.net.factory.MailSender;
import com.net.factory.Sender;
import com.net.factory.SmsSender;

/**
 * Created by wuxiaolong on 2017/10/26.
 */

public class Buider {
    private List<Sender> list = new ArrayList<Sender>();
    public void produceMailSender(int count){
        for (int i=0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }
}
