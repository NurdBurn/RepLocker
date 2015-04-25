package com.example.ben.weight;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.util.ArrayMap;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    public static int itemOnListClicked;
    public static int dialogButtonClicked = 0;
    static arrayHandler arrayHandler = new arrayHandler();
    static maxData maxData = new maxData();






    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        itemOnListClicked = position;

        if(position == 0){
            fragmentManager.beginTransaction()
                    .replace(R.id.container, account_fragment.newInstance())
                    .commit();

        } else if(position == 1){
            fragmentManager.beginTransaction()
                    .replace(R.id.container, rep_zone_fragment.newInstance())
                    .commit();
        }
        else
            if(position == 2){
                fragmentManager.beginTransaction()
                        .replace(R.id.container, teams_fragment.newInstance())
                        .commit();
            }
        else
            if(position == 3) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, lockerRoom.newInstance())
                        .commit();
            }
        else
            if(position == 4) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, lockerRoomTwo.newInstance())
                        .commit();
            }
        else
            if(position == 5) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, lockerRoomThree.newInstance())
                        .commit();
            }
        else
            if(position == 6) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, lockerRoomFour.newInstance())
                        .commit();
            }
        else
            if(position == 7) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, lockerRoomFive.newInstance())
                        .commit();
            }

    }


    public void onSectionAttached(int somethingPassed) {

       String titleNav = (arrayHandler.navBarList).get(somethingPassed - 1);

        int arraySize = (arrayHandler.navBarList).size();




            if (titleNav == null) {
                mTitle = (arrayHandler.navBarList).get(somethingPassed - 1);
            } else {
                mTitle = titleNav;
            }
    }




    //This is for the DIOLOG BOX THINGY
    public void showDialog(View v){




        if (v.getId() == R.id.benchPress){
            myDialog dialogBench = new myDialog();
            dialogBench.show(getFragmentManager(), "Bench Dialog");
            dialogButtonClicked = 1;
        }
        else if (v.getId() == R.id.powerCleans) {
            myDialog dialogPower = new myDialog();
            dialogPower.show(getFragmentManager(), "Power Dialog");
            dialogButtonClicked = 2;
        }
       else if (v.getId() == R.id.squat){
            myDialog dialogSquat = new myDialog();
            dialogSquat.show(getFragmentManager(), "Squat Dialog");
            dialogButtonClicked = 3;
            }
    }


    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBench:
                if (checked) {
                    maxData.displayBench = 1;

                }
                else
                    maxData.displayBench = 2;
                break;
            case R.id.checkIncline:
                if (checked) {
                    maxData.displayIncline = true;
                }
                else
                    maxData.displayIncline = false;
                break;
        }
    }






    //This is for the lifts that you do not enter
    public void showDetermined(View v){
        Toast.makeText(getApplicationContext(), "Max determined above",
                Toast.LENGTH_LONG).show();
    }



























    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);

        actionBar.setTitle(mTitle);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        switch (id){
            case R.id.action_settings:

                Toast.makeText(getApplicationContext(), "Settings",
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_example:
                Intent logoutFragment = new Intent(MainActivity.this, loginScreen.class);
                startActivity(logoutFragment);

                Toast.makeText(getApplicationContext(), "Logging Out",
                        Toast.LENGTH_LONG).show();

                return true;
        }

        //noinspection SimplifiableIfStatement
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
