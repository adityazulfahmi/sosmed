package com.example.ss0051pc.hereo;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by SS0051pc on 3/11/2017.
 */

public class MessagesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }
        View view = inflater.inflate(R.layout.messages_fragment, container, false);
        ImageButton ib = (ImageButton) view.findViewById(R.id.chatMockup);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)MessagesFragment.this.getActivity()).goToMessageDetails();

            }
        });
        return view;
    }
}
