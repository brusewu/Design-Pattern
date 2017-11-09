package com.net.command;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
