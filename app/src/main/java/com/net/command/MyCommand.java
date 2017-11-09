package com.net.command;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void exe(){
        receiver.action();
    }
}
