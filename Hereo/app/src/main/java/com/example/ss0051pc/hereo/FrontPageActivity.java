package com.example.ss0051pc.hereo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by SS0051pc on 3/11/2017.
 */

public class FrontPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void goToHome(View v) {
        // does something very interesting
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToLogin(View v) {
        // does something very interesting
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void goToRegister(View v) {
        // does something very interesting
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
