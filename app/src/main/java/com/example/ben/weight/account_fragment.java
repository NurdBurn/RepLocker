package com.example.ben.weight;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TableRow;

public class account_fragment extends Fragment implements OnClickListener{

    Button workoutButton;
    static maxData maxData = new maxData();

    static TableRow benchRow;
    static TableRow inclineRow;
    static TableRow powerRow;
    static TableRow hangRow;
    static TableRow squatRow;
    static TableRow deadRow;

    public static account_fragment newInstance(){

        account_fragment fragment = new account_fragment();

        return fragment;
    }



    public account_fragment(){}

    @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);
        workoutButton = (Button) rootView.findViewById(R.id.workoutButton);
        workoutButton.setOnClickListener(this);

        benchRow = (TableRow) rootView.findViewById(R.id.homeBench);
        inclineRow = (TableRow) rootView.findViewById(R.id.homeIncline);
        powerRow = (TableRow) rootView.findViewById(R.id.homePower);
        hangRow = (TableRow) rootView.findViewById(R.id.homeHang);
        squatRow = (TableRow) rootView.findViewById(R.id.homeSquat);
        deadRow = (TableRow) rootView.findViewById(R.id.homeDead);
        return rootView;

    }

    @Override
    public void onResume() {
        super.onResume();
        if (maxData.displayBench == 1){
            benchRow.setVisibility(View.GONE);
        }
        else{
            int fill = 21;
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.workoutButton:
                Intent WorkoutSchedule = new Intent(getActivity(), WorkoutSchedule.class);
                startActivity(WorkoutSchedule);
            break;
        }
    }
}
