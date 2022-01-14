package com.example.myloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class HealthBlogView extends AppCompatActivity {

    private WebView BlogsView;
    private String keyIdentifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_vlog_view);

        //finding ID and setting action on blogView
        BlogsView=findViewById(R.id.HealthBlogView);

        keyIdentifier = getIntent().getExtras().getString("url");
        BlogsView.loadUrl(keyIdentifier);
    }
}