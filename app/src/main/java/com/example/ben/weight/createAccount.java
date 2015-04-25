package com.example.ben.weight;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class createAccount extends Activity {
    private EditText lname = null;
    private EditText fname = null;
    private EditText usernameCreate = null;
    private EditText email = null;
    private EditText passwordAccount = null;
    private EditText passwordConfirm = null;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        lname = (EditText) findViewById(R.id.lName);
        fname = (EditText) findViewById(R.id.fName);
        usernameCreate = (EditText) findViewById(R.id.usernameCreate);
        email = (EditText) findViewById(R.id.email);
        passwordAccount = (EditText) findViewById(R.id.passwordAccount);
        passwordConfirm = (EditText) findViewById(R.id.passwordConfirm);
        createAccountButton = (Button) findViewById(R.id.createAccountButton);
    }


    public void createAccountButton(View view) {



    }
}