package com.example.myloginpage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

public class Test_pro_activity extends AppCompatActivity {


    private TextView nameTxt , emailTxt,fullNameTxt,phoneNumberTxt;
    private Button logOut;
    private FirebaseAuth fAuth;
    private FirebaseFirestore fstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_pro);

        nameTxt=findViewById(R.id.name_Id);
        emailTxt=findViewById(R.id.email_id);
        fullNameTxt= findViewById(R.id.fullName_id);
        phoneNumberTxt=findViewById(R.id.phone_id);
        logOut=findViewById(R.id.logOutID);

        //firebase auth instance
        fAuth= FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();

        //log out function
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(getApplicationContext(), "Logging out Successfully", Toast.LENGTH_SHORT).show();
                Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.MainActivity.class);
                startActivity(noyaIntent);
            }
        });

        //firebase auth and fatching user's name and email id and phone number
        FirebaseUser user= FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            String uid=fAuth.getCurrentUser().getUid();
            Log.d("abc", uid+ " => ");
            DocumentReference docRef= fstore.collection("users").document(uid);
            docRef.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
                @Override
                public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                    emailTxt.setText(value.getString("email"));
                    nameTxt.setText(value.getString("userName"));
                    phoneNumberTxt.setText(value.getString("phoneNumber"));
                    fullNameTxt.setText(value.getString("fullName"));
                }
            });



            //setting user name , email address and phone number
            //nameTxt.setText("User Name : "+Username);
            //emailTxt.setText("Email : "+email);

        }
    }
}