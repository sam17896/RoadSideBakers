package com.example.ahsan.roadsidebakers;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SharedPreferences prefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
            Thread time = new Thread() {
                public void run() {

                    try {
                        sleep(2000);
                    } catch (InterruptedException e)

                    {
                        e.printStackTrace();
                    } finally {
                        Intent i = new Intent("com.example.ahsan.b_tendance.SCREEN1");
                        startActivity(i);
                    }
                }


            };
            time.start();
        }

    }
