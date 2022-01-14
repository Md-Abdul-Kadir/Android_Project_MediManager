package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Health_tips extends AppCompatActivity {

    private Button readmore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);
        readmore=findViewById(R.id.readmoreTipsId);


        //setting action on readmore button
        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("clicked","Clicked hoyese");
                Intent noyaIntent = new Intent(getApplicationContext(), healthtipsView.class);
                noyaIntent.putExtra("url","https://jccstl.com/blog/100-health-fitness-tips/");
                startActivity(noyaIntent);
            }
        });
    }


}