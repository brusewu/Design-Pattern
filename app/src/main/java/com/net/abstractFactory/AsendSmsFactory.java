package com.net.abstractFactory;

import com.net.factory.Sender;

/**
 * Created by wuxiaolong on 2017/10/25.
 */

public class AsendSmsFactory implements NewProvider {
    @Override
    public Sender produce(){
        return new AsmsSender();
    }
}
