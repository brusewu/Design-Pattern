package com.net.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.net.R;

/**
 * Created by wuxiaolong on 2017/10/24.
 */

public class FactoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
       initTitleView();
        oneFactory();
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
    //one factory
    public void oneFactory(){

        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();

    }

    //more factory
    public void moreFactory(){

        MoreSendFactory moreSendFactory = new MoreSendFactory();
        Sender sender = moreSendFactory.produceMail();
        sender.send();
    }
}
