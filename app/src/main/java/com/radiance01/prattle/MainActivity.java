package com.radiance01.prattle;

import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    Boolean streach = true;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {


                if(streach)
                {
                    layout.animate().scaleXBy((float) 0.08).scaleYBy((float) 0.08).setDuration(1000);
                    streach = false;
                }
                else
                {
                    layout.animate().scaleXBy((float) -0.05).scaleYBy((float) -0.05).setDuration(1500);
                    streach = true;
                }
            }

            @Override
            public void onFinish() {

                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim, R.anim.anim);
            }
        }.start();

    }
}
