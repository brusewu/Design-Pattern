package com.net.singleton;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.net.R;

/**
 * Created by wuxiaolong on 2017/10/25.
 */

public class SingletonTest {

    private static SingletonTest instance = null;
    private SingletonTest(){}
    private static synchronized void syncInit(){
        if (instance == null){
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance(){
        if (instance == null){
            syncInit();
        }
        return instance;
    }


}
