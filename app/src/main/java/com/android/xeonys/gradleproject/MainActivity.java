package com.android.xeonys.gradleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.lib.StringGenerator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringGenerator.sayHello();
    }
}
