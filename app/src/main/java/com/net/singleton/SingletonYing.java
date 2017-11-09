package com.net.singleton;

import java.util.Vector;

/**
 * Created by wuxiaolong on 2017/10/25.
 */

public class SingletonYing {

    private static SingletonYing instance = null;

    private Vector properties = null;

    public Vector getProperties(){
        return properties;
    }
    private SingletonYing(){

    }

    private static synchronized void syncInit(){
        if (instance == null){
            instance = new SingletonYing();
        }
    }
    public static SingletonYing getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
    }

    public void updateProperties(){
        SingletonYing shadow = new SingletonYing();
        properties = shadow.getProperties();
    }
}
