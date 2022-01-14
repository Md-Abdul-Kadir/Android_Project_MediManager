package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class healthtipsView extends AppCompatActivity {

    private WebView tipsView;
    private String keyIdentifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthtips_view);
        tipsView=findViewById(R.id.HealthtipsViewid);

        keyIdentifier = getIntent().getExtras().getString("url");
        tipsView.loadUrl(keyIdentifier);
    }
}