package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dashboard1 extends AppCompatActivity implements View.OnClickListener {

    private ImageView profileBtn;
    private CardView DorctorSearch, AbulanceService, HealthBlog,HealthTips,MedicineAlarm,MedicineService,chatBot,OpticalAid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);

        //finding Id
        DorctorSearch=findViewById(R.id.doctorSearchID);
        AbulanceService=findViewById(R.id.ambulanceID);
        MedicineAlarm=findViewById(R.id.mediAlarmId);
        HealthBlog=findViewById(R.id.helthBlogID);
        HealthTips=findViewById(R.id.heathTipsID);
        MedicineService=findViewById(R.id.medicineServiceID);
        OpticalAid=findViewById(R.id.OpticalAidId);
        chatBot=findViewById(R.id.ChatBotID);
        profileBtn=findViewById(R.id.profileBtnID);



        //setting on click listener
        DorctorSearch.setOnClickListener(this);
        AbulanceService.setOnClickListener(this);
        MedicineAlarm.setOnClickListener(this);
        HealthBlog.setOnClickListener(this);
        HealthTips.setOnClickListener(this);
        MedicineService.setOnClickListener(this);
        OpticalAid.setOnClickListener(this);
        chatBot.setOnClickListener(this);

        profileBtn.setOnClickListener(this);

    }


    //action on cardviews
    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.profileBtnID)
        {
            Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.Test_pro_activity.class);
            startActivity(noyaIntent);
        }
        else if(v.getId()==R.id.doctorSearchID){
            //System.out.println("doctorSearchID");
            Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.Test_pro_activity.class);
            startActivity(noyaIntent);

        }
        else if(v.getId()==R.id.ambulanceID){
            System.out.println("doctorSearchID");
        }
        else if(v.getId()==R.id.mediAlarmId){
            //System.out.println("mediAlarmId");
            Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.AlarmMain.class);
            startActivity(noyaIntent);
        }
        else if(v.getId()==R.id.helthBlogID){
            //System.out.println("HealthBlog ");
            Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.HealthBlog.class);
            startActivity(noyaIntent);
        }
        else if(v.getId()==R.id.heathTipsID){
           // System.out.println("Health Blog");
            Intent noyaIntent = new Intent(getApplicationContext(), com.example.myloginpage.Health_tips.class);
            startActivity(noyaIntent);
        }
        else if(v.getId()==R.id.medicineServiceID)
        {
            System.out.println("medicineServiceID");
        }
        else if(v.getId()==R.id.OpticalAidId)
        {
            System.out.println("Optical Aid Section");
        }
        else if(v.getId()==R.id.ChatBotID)
        {
            System.out.println("ChatBot Section");
        }

    }
}