package com.net.abstractFactory;

import com.net.factory.Sender;

/**
 * Created by wuxiaolong on 2017/10/25.
 */

public interface NewProvider {
    public Sender produce();
}
