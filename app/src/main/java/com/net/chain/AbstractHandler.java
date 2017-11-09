package com.net.chain;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public abstract class AbstractHandler {

    private Handler handler;
    public Handler getHandler(){
        return handler;
    }
    public void setHandler(Handler handler){
        this.handler = handler;
    }
}
