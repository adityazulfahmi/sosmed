package com.example.ss0051pc.hereo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;


    private TimelineFragment timelineFragment;
    private HelpFragment helpFragment;
    private ProfileFragment profileFragment;
    private MessagesFragment messagesFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        timelineFragment = new TimelineFragment();
        helpFragment = new HelpFragment();
        profileFragment = new ProfileFragment();
        messagesFragment = new MessagesFragment();

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menuicon:
                                getFragmentManager().beginTransaction().replace((R.id.container), timelineFragment).commit();
                                break;
                            case R.id.caribantuan:
                                getFragmentManager().beginTransaction().replace((R.id.container), helpFragment).commit();
                                break;
                            case R.id.profilsaya:
                                getFragmentManager().beginTransaction().replace((R.id.container), profileFragment).commit();
                                break;
                            case R.id.chatpribadi:
                                getFragmentManager().beginTransaction().replace((R.id.container), messagesFragment).commit();
                                break;
                        }
                        return true;
                    }
                });

        ActionBar actionBar = getSupportActionBar();
        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflator.inflate(R.layout.custom_actionbar, null);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        actionBar.setCustomView(v);


        getFragmentManager().beginTransaction().replace(R.id.container, timelineFragment).commit();
    }

    public void goToMessageDetails() {
        Intent intent = new Intent(this, MessageDetailsActivity.class);
        startActivity(intent);
    }
}
