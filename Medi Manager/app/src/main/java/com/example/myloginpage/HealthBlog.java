package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HealthBlog extends AppCompatActivity {

    private View MotherCare;
    private View ChildCare;
    private View AdoloscantCare;
    private View ManCare;
    private View WomanCare;
    private View OldAgeCare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthvlog_list);

        //findings all ID
        MotherCare = findViewById(R.id.MotherCareID);
        ChildCare = findViewById(R.id.BabyCareID);
        AdoloscantCare= findViewById(R.id.AdoloscentCareID);
        ManCare = findViewById(R.id.ManCareID);
        WomanCare = findViewById(R.id.WomanCareID);
        OldAgeCare = findViewById(R.id.OldCareID);

        //setting action on motherCare
        MotherCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("clicked","Clicked hoyese");
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://www.healthynewbornnetwork.org/blog/bangladesh-continues-to-promote-kangaroo-mother-care-amidst-covid-19-pandemic-to-prevent-prematurity-related-complications-and-deaths/");
                startActivity(noyaIntent);
            }
        });

        //setting action on childCare
        ChildCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://blog.feedspot.com/baby_care_blogs/");
                startActivity(noyaIntent);
            }
        });

        //setting action on AdolosecantCare
        AdoloscantCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://www.teenhealthcare.org/the-blog/");
                startActivity(noyaIntent);
            }
        });

        //setting action on ManCare
        ManCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://www.healthline.com/health/mens-health/best-mens-health-blogs#1");
                startActivity(noyaIntent);
            }
        });

        //setting action on womanCare
        WomanCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://www.healthline.com/health/best-womens-health-blogs#1");
                startActivity(noyaIntent);

            }
        });

        //setting action on oldAgeCare
        OldAgeCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noyaIntent = new Intent(getApplicationContext(), HealthBlogView.class);
                noyaIntent.putExtra("url","https://www.rightathome.net/blog");
                startActivity(noyaIntent);
            }
        });


    }




}