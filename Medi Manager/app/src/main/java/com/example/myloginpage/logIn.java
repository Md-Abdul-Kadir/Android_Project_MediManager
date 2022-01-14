package com.example.myloginpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class logIn extends AppCompatActivity implements View.OnClickListener {

    private EditText emailEditText,passEditText;
    private Button loginPageButton,registerinLoginPageButton;
    private ProgressBar progressLogin;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //firebase auth
        mAuth = FirebaseAuth.getInstance();

        //finding all ID
        emailEditText = findViewById(R.id.emailLoginID);
        passEditText = findViewById(R.id.passLoginID);
        loginPageButton = findViewById(R.id.loginpageID);
        registerinLoginPageButton = findViewById(R.id.registerinLoginPAgeID);

        progressLogin=findViewById(R.id.loginPBID);



        loginPageButton.setOnClickListener(this);
        registerinLoginPageButton.setOnClickListener(this);


    }

    //setting action on all buttons
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.loginpageID:
                userLogIn();
                break;

            case R.id.registerinLoginPAgeID:
                Intent noyaIntent =new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(noyaIntent);
                break;


        }

    }

    //login function
    private void userLogIn() {

        String email = emailEditText.getText().toString().trim();
        String password = passEditText.getText().toString().trim();

        //checking the validity of the Email ID
        if(email.isEmpty())
        {
            emailEditText.setError("Enter an email address");
            emailEditText.requestFocus();
            return;
        }

        //checking the validity of the Email ID
        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            emailEditText.setError("Enter a valid email address");
            emailEditText.requestFocus();
            return;
        }

        //checking the validity of the password
        if(password.isEmpty())
        {
            passEditText.setError("Enter a password");
            passEditText.requestFocus();
            return;
        }
        if(password.length()<6)
        {
            passEditText.setError("Password should be at least 6 character");
            passEditText.requestFocus();
            return;
        }
        progressLogin.setVisibility(View.VISIBLE);

        //sending data in firebase and login and sign in process
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    progressLogin.setVisibility(View.GONE);

                    if(!mAuth.getCurrentUser().isEmailVerified())
                    {
                        Intent noyaIntent = new Intent(getApplicationContext(),Email_varifiaction.class);
                        Toast.makeText(logIn.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        //noyaIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //clear of all previous activities
                        startActivity(noyaIntent);
                    }
                    else {
                        Toast.makeText(logIn.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        Intent noyaIntent = new Intent(getApplicationContext(), dashboard1.class);
                        //noyaIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //clear of all previous activities
                        startActivity(noyaIntent);
                    }
                }
                else
                {

                    Toast.makeText(logIn.this,"Login Unsuccessful",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}