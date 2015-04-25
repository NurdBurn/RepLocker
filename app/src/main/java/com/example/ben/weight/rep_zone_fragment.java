package com.example.ben.weight;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.FragmentManager;
import android.app.DialogFragment;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.BaseAdapter;

public class rep_zone_fragment extends Fragment {


    //Asking main activity politely for all of it's goodies
    static MainActivity main = new MainActivity();
    static maxData maxData = new maxData();


    public TextView maxBenchDisplay;
    public TextView maxInclineDisplay;
    public TextView maxPowerDisplay;
    public TextView maxHangDisplay;
    public TextView maxSquatDisplay;
    public TextView maxDeadLiftDisplay;






    //Max Handler


    public static rep_zone_fragment newInstance(){

        rep_zone_fragment fragment = new rep_zone_fragment();

        return fragment;
    }


    public rep_zone_fragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_rep_zone_fragment, container, false);


       maxBenchDisplay = (TextView) rootView.findViewById(R.id.maxBenchDisplay);
        maxInclineDisplay = (TextView) rootView.findViewById(R.id.maxInclineDisplay);
        maxPowerDisplay = (TextView) rootView.findViewById(R.id.maxPowerDisplay);
        maxHangDisplay = (TextView) rootView.findViewById(R.id.maxHangDisplay);
        maxSquatDisplay = (TextView) rootView.findViewById(R.id.maxSquatDisplay);
       maxDeadLiftDisplay = (TextView) rootView.findViewById(R.id.maxDeadliftDisplay);





        return rootView;

    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...

        String benchFinalString = String.valueOf(maxData.benchMaxFinal);
        String inclineFinalString = String.valueOf(maxData.inclineMaxFinal);
        String powerCleanFinalString = String.valueOf(maxData.powerCleanMaxFinal);
        String hangCleanFinalString = String.valueOf(maxData.hangCleanMaxFinal);
        String squatFinalString = String.valueOf(maxData.squatMaxFinal);
        String deadLiftFinalString = String.valueOf(maxData.deadLiftMaxFinal);

        maxBenchDisplay.setText(benchFinalString);
        maxInclineDisplay.setText(inclineFinalString);
        maxPowerDisplay.setText(powerCleanFinalString);
        maxHangDisplay.setText(hangCleanFinalString);
        maxSquatDisplay.setText(squatFinalString);
        maxDeadLiftDisplay.setText(deadLiftFinalString);




        Toast.makeText(getActivity().getApplicationContext(), benchFinalString,
                Toast.LENGTH_LONG).show();


    }





    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(2);
    }




}
