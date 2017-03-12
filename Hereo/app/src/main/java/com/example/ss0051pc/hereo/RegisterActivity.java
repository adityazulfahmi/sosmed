package com.example.ss0051pc.hereo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by SS0051pc on 3/11/2017.
 */

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerlayout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    public void goToHome(View v) {
        // does something very interesting
        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this.getApplicationContext(),"Register Success",Toast.LENGTH_SHORT).show();
        startActivity(intent);

    }
}
