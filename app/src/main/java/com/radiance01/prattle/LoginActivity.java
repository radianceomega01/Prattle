package com.radiance01.prattle;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class LoginActivity extends AppCompatActivity {
    Button login_button;
    TextView signup;
    Button google_signup_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        login_button = findViewById(R.id.login_button);
        signup = findViewById(R.id.signup);
        google_signup_button = findViewById(R.id.google_signup);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
                CustomIntent.customType(LoginActivity.this,"bottom-to-up");
            }
        });
        google_signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
