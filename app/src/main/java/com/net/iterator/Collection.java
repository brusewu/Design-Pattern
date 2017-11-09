package com.net.iterator;


/**
 * Created by wuxiaolong on 2017/11/8.
 */

public interface Collection {

    public Iterator iterator();
    //get the object
    public Object get(int i);

    public int size();
}
