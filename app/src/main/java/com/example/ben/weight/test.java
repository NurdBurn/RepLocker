package com.example.ben.weight;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class test extends Fragment {









    //Not Sure what this is for
    public static Fragment newInstance() {
        test fragment = new test();
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


        ((MainActivity) activity).onSectionAttached(2);
    }


}
