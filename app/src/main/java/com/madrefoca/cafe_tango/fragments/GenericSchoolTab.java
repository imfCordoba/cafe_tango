package com.madrefoca.cafe_tango.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.madrefoca.cafe_tango.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GenericSchoolTab extends Fragment {


    public GenericSchoolTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_generic_school_tab, container, false);
    }

}