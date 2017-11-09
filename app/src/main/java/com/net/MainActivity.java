package com.net;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

import com.net.abstractFactory.AbstractFactoryActivity;
import com.net.factory.FactoryActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) throws IOException {
        switch (view.getId()) {

            case R.id.factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.abstractFactory:
                startActivity(new Intent(this, AbstractFactoryActivity.class));
                break;

            default:
                break;
        }
    }
}

