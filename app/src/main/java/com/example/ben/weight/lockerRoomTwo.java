package com.example.ben.weight;



import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.ArrayList;

public class lockerRoomTwo extends Fragment {





    //Not Sure what this is for
    public static Fragment newInstance() {
        lockerRoomTwo fragment = new lockerRoomTwo();
        return fragment;
    }



    //Basically the entire control center.
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.team_template, container, false);

        return rootView;

    }


    //Passing data to set the title of the activity/fragment
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(5);
    }


}
