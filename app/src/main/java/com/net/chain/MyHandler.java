package com.net.chain;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MyHandler extends AbstractHandler implements Handler {

    private String name;
    public MyHandler(String name){
        this.name = name;
    }
    @Override
    public void operator(){
        System.out.println(name+"deal");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
