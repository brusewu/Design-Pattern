package com.net.adapter;

/**
 * Created by wuxiaolong on 2017/10/30.
 */

public class WrapperTest {

    public WrapperTest(){
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();
        sourceable2.method1();
        sourceable2.method2();
    }
}
