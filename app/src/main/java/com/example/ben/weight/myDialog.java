package com.example.ben.weight;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.content.Intent;
import android.app.Fragment;



public class myDialog extends DialogFragment implements View.OnClickListener {
    public static EditText reps = null;
    public static EditText dialogWeight = null;
    public static Button dialogUpdate;


    //Asking main activity politely for all of it's goodies
    static MainActivity main = new MainActivity();
    static rep_zone_fragment repZone = new rep_zone_fragment();
    static ApplicationContextProvider appContext = new ApplicationContextProvider();
    static maxData maxData = new maxData();


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Get the Layout Inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout, null);

        builder.setView(view);


        dialogUpdate = (Button) view.findViewById(R.id.dialogUpdate);
        dialogUpdate.setOnClickListener(this);

        //Grabbing and parsing the number of reps they do
        reps = (EditText) view.findViewById(R.id.reps);


        //Grabbing and parsing the amount of weight they lift
        dialogWeight = (EditText) view.findViewById(R.id.dialogWeight);


        return builder.create();
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dialogUpdate:
                String repsString = reps.getText().toString();
                double repsDouble = Double.parseDouble(repsString);

                String weightString = dialogWeight.getText().toString();
                double weightDouble = Double.parseDouble(weightString);


                if (main.dialogButtonClicked == 1) {
                    maxData.benchMaxFinal = weightDouble;


                    Toast.makeText(getActivity().getApplicationContext(), weightString,
                            Toast.LENGTH_LONG).show();
                    getDialog().dismiss();
                } else if (main.dialogButtonClicked == 2) {
                    maxData.powerCleanMaxFinal = weightDouble;
                    Toast.makeText(getActivity().getApplicationContext(), weightString,
                            Toast.LENGTH_LONG).show();
                    getDialog().dismiss();
                } else if (main.dialogButtonClicked == 3) {
                    maxData.squatMaxFinal = weightDouble;
                    Toast.makeText(getActivity().getApplicationContext(), weightString,
                            Toast.LENGTH_LONG).show();
                    getDialog().dismiss();
                }

                break;
        }


    }


}
