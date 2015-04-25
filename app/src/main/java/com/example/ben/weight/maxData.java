package com.example.ben.weight;


import android.app.Application;

public class maxData extends Application {
    static myDialog mydialog = new myDialog();

    //Okay, seriously....This is extremely obvious. Just read the variables
    static double benchMaxFinal = 0;
    static double inclineMaxFinal = benchMaxFinal * .8;
    static double powerCleanMaxFinal = 0;
    static double hangCleanMaxFinal = powerCleanMaxFinal * .8;
    static double squatMaxFinal = 0;
    static double deadLiftMaxFinal = squatMaxFinal * .8;

//These are variables to check whether or not they want to display certain lifts
    static int displayBench = 1;
    static boolean displayIncline = false;
    static boolean displayPower = false;
    static boolean displayHang = false;
    static boolean displaySquat = false;
    static boolean displayDead = false;

}
