package com.example.ss0051pc.hereo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Ridwan Arvihafiz on 3/12/2017.
 */

public class TimelineClickedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.timelineclicked);
        ImageButton ib = (ImageButton) findViewById(R.id.mockuppopup);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TimelineClickedActivity.this.getApplicationContext(),"Request membantu berhasil dibuat",Toast.LENGTH_SHORT).show();

                onBackPressed();

            }
        });
    }
}
