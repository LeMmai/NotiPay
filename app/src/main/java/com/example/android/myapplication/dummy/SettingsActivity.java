package com.example.android.myapplication.dummy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.myapplication.R;

/**
 * Created by User on 3/13/2017.
 */

public class SettingsActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.activity_my_bills, container, false);

        return view;
    }
}
