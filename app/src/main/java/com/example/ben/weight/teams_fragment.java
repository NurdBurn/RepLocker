package com.example.ben.weight;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;
import java.util.Arrays;
import java.util.ArrayList;


public class teams_fragment extends Fragment implements OnClickListener{

    //All these things do is make it so we can communicate between classes. Yep
    static teams_fragment teams = new teams_fragment();
    static arrayHandler arrayHandler = new arrayHandler();
    static MainActivity MainActivity = new MainActivity();

    public Button joinButton;
    public EditText teamCode;
    public Button createTeamButton;


    public static int nextOpenSlot;





    public static teams_fragment newInstance(){

       teams_fragment fragment = new teams_fragment();

        return fragment;
    }



    public teams_fragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_teams, container, false);
        joinButton = (Button) rootView.findViewById(R.id.joinButton);
        joinButton.setOnClickListener(this);

        createTeamButton = (Button) rootView.findViewById(R.id.createTeamButton);
        createTeamButton.setOnClickListener(this);

        teamCode = (EditText) rootView.findViewById(R.id.teamCode);


        return rootView;

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(3);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.joinButton:
                String secretTeamCode = teamCode.getText().toString();
                int finalTeamCodeEntry = Integer.parseInt(secretTeamCode);


                if (finalTeamCodeEntry == 12345){
                    nextOpenSlot = ((arrayHandler.navBarList).size());

                   if (nextOpenSlot < 8) {

                       Toast.makeText((getActivity().getApplicationContext()), "Joining...",
                               Toast.LENGTH_SHORT).show();


                       (arrayHandler.navBarList).add(nextOpenSlot, "Team 3");
                       //This is going to be changed, but keep the basic idea...Okay?????
                   }
                   else {
                       Toast.makeText((getActivity().getApplicationContext()), "Too many teams",
                               Toast.LENGTH_SHORT).show();
                   }


                }


             //   Intent WorkoutSchedule = new Intent(getActivity(), WorkoutSchedule.class);
              //  startActivity(WorkoutSchedule);


                break;
            case R.id.createTeamButton:
                Toast.makeText((getActivity().getApplicationContext()), "Entering Creation Zone...",
                        Toast.LENGTH_SHORT).show();
                Intent newTeamZone = new Intent(getActivity(), teamCreation.class);
                startActivity(newTeamZone);

                break;
        }
    }



}

