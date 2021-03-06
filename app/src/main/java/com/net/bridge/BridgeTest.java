package com.net.bridge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.net.R;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class BridgeTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        initTitleView();

        Bridge bridge = new MyBridge();

        //the first one
        Sourceable sourceable1 = new SourceSub1();
        bridge.setSource(sourceable1);
        bridge.method();

        //the second one
        Sourceable sourceable2 = new SourceSub2();
        bridge.setSource(sourceable2);
        bridge.method();

    }
    private void initTitleView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Factory");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
