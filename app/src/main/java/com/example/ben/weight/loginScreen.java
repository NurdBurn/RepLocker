package com.example.ben.weight;

import android.content.DialogInterface;
import android.content.Intent;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class loginScreen extends Activity {

    private EditText username = null;
    private EditText password = null;
    private TextView attempts;
    private Button login;
    int counter = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (EditText) findViewById(R.id.usernameEntry);
        password = (EditText) findViewById(R.id.passwordEntry);
        attempts = (TextView) findViewById(R.id.textView5);
        attempts.setText(Integer.toString(counter));
        login = (Button) findViewById(R.id.button1);
        Button newAccount = (Button) findViewById(R.id.createAccountButton);

    }


    public void login(View view) {


        if(username.getText().toString().equals("a") &&
                password.getText().toString().equals("a")){
            Toast.makeText(getApplicationContext(), "Redirecting...",
                    Toast.LENGTH_SHORT).show();

            Intent accountFragment = new Intent(loginScreen.this, MainActivity.class);
            startActivity(accountFragment);
           
        }

        else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials",
                    Toast.LENGTH_SHORT).show();
            attempts.setBackgroundColor(Color.WHITE);
            counter--;
            attempts.setText(Integer.toString(counter));
            if(counter==0){
                login.setEnabled(false);
            }


        }


    }

    public void newAccount(View view){

        Toast.makeText(getApplicationContext(), "Redirecting...",
                Toast.LENGTH_SHORT).show();

        Intent accountFragment = new Intent(loginScreen.this, createAccount.class);
        startActivity(accountFragment);

    }

}

