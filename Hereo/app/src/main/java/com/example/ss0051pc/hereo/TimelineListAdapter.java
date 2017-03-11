package com.example.ss0051pc.hereo;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by SS0051pc on 3/11/2017.
 */
public class TimelineListAdapter extends ArrayAdapter {

    Problem[] data ;
    public TimelineListAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
        data = (Problem[])objects;
    }



}
