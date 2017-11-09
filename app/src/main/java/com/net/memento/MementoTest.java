package com.net.memento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.net.R;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class MementoTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
        initTitleView();

        //create class
        Original origi = new Original("egg");
        //
        Storage storage = new Storage(origi.createMemento());
        //
        System.out.println("init state"+origi.getValue());
        origi.setValue("niu");
        System.out.println("modify later:"+origi.getValue());
        //Return to original state
        origi.restoreMemento(storage.getMemento());
        System.out.println("restore :"+origi.getValue());
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
