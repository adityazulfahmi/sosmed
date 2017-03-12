package com.example.ss0051pc.hereo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by SS0051pc on 3/11/2017.
 */

public class HelpFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }
        View view = inflater.inflate(R.layout.help_fragment, container, false);
        ImageButton ib = (ImageButton) view.findViewById(R.id.mintabantuan);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)HelpFragment.this.getActivity()).sendHelpMessage();

            }
        });
        return view;
    }
}
