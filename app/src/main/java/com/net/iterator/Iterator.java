package com.net.iterator;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public interface Iterator {

    public Object previous();
    public Object next();
    public boolean hasNext();

    public Object first();
}
