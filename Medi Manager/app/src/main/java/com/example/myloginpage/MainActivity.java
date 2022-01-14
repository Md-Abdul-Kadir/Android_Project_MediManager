package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginStart, signupStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginStart =findViewById(R.id.loginID);
        signupStart=findViewById(R.id.signupID);

        loginStart.setOnClickListener(this);
        signupStart.setOnClickListener(this);
    }

    //setting action on all buttons
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.loginID:
                Intent   noyaIntent = new Intent(getApplicationContext(),logIn.class);
                startActivity(noyaIntent);
                break;

            case R.id.signupID:
                Intent   noya2Intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(noya2Intent);
                break;
        }




    }
}