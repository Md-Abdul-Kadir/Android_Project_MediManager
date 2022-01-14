package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;

public class Email_varifiaction extends AppCompatActivity {

    private TextView verifymsg;
    private Button verifyBtn,LogInAgain;
    private EditText TxtField;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_varifiaction);

        auth= FirebaseAuth.getInstance();

        verifymsg=findViewById(R.id.textViewID);
        verifyBtn=findViewById(R.id.verifyBtnID);
        LogInAgain=findViewById(R.id.LogInAgainID);






        verifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth.getCurrentUser().sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(Email_varifiaction.this,"Verification mail sent", Toast.LENGTH_SHORT).show();

                         verifyBtn.setVisibility(View.GONE);



                    }
                });
            }
        });

        LogInAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), logIn.class);
                startActivity(noyaIntent);
            }
        });

    }
}