package com.example.munoz_c.testapp;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int addThem(int v1,int v2){
        return v1+v2+v1;//db3
    }
}
