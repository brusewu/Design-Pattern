package com.net.iterator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.net.R;

/**
 * Created by wuxiaolong on 2017/11/8.
 */

public class IteratorTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);

        initTitleView();

        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
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
