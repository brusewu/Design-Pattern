package com.net.prototype;

/**
 * Created by wuxiaolong on 2017/10/27.
 */

public class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException{
        Prototype proto = (Prototype)super.clone();
        return proto;
    }
}

