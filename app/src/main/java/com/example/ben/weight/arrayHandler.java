package com.example.ben.weight;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class arrayHandler {



    //This is what is displayed on the nav bar
    public static List<String> navBarList = new ArrayList<>(Arrays.asList("Home","Rep Zone","Teams"));

    //This is a test for position stuff
    public static String navBarListArray[] = navBarList.toArray(new String[navBarList.size()]);


    //This is our Dummy Array for workout shtuff....
    public static List<String> fitnessData = new ArrayList<>(Arrays.asList("I'm SO HUGE"));

    //This array is just to make the whole position thing work well
    public static List<String> fillerForTeam = new ArrayList<>(Arrays.asList("This","Is","Sparta"));

    //Store Team Arrays
    public static List<String> Ballers = new ArrayList<>(Arrays.asList("Ballers","Test"));


    //List of all arrays
    //public static List <String> navBarArrays = new ArrayList<>(Arrays.asList(navBarList,fillerForTeam,Ballers))



   // ArrayList navBarArrays = new ArrayList(Arrays.asList(navBarList, fitnessData, fillerForTeam, Ballers));

    public static double[] maxArray = {0,0,0,0,0,0};

}
