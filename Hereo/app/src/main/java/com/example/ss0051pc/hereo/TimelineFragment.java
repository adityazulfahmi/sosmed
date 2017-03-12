package com.example.ss0051pc.hereo;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by SS0051pc on 3/11/2017.
 */

public class TimelineFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (container != null) {
            container.removeAllViews();
        }
        View view = inflater.inflate(R.layout.timeline_fragment, container, false);

        return view;
    }



    /*
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Problem data[] = new Problem[]
                {
                        new Problem(R.drawable.nobody, "Reka Ramadhan", "Butuh bantuan untuk menyebrang jalan, untuk membeli obat","3 menit yang lalu"),
                        new Problem(R.drawable.nobody, "Reka Ramadhan", "Butuh bantuan untuk menyebrang jalan, untuk membeli obat","3 menit yang lalu"),
                        new Problem(R.drawable.nobody, "Reka Ramadhan", "Butuh bantuan untuk menyebrang jalan, untuk membeli obat","3 menit yang lalu"),
                        new Problem(R.drawable.nobody, "Reka Ramadhan", "Butuh bantuan untuk menyebrang jalan, untuk membeli obat","3 menit yang lalu"),
                        new Problem(R.drawable.nobody, "Reka Ramadhan", "Butuh bantuan untuk menyebrang jalan, untuk membeli obat","3 menit yang lalu")
                };

        TimelineListAdapter adapter = new TimleineListAdapter (getActivity(),
                R.layout.item_list_timeline, data);

        setListAdapter(adapter);

    }*/
}
