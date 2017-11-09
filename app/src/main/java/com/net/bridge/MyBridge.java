package com.net.bridge;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
