package com.example.gymapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp ,cloverimg;
    LinearLayout splashtext, hometext, menu;
    Animation frombottom ;
    private Button planBtn;
    private Button progressBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bgapp = (ImageView)findViewById(R.id.bgapp);
        cloverimg = (ImageView)findViewById(R.id.cloverimg);
        splashtext = (LinearLayout)findViewById(R.id.splashtext);
        hometext = (LinearLayout)findViewById(R.id.hometext);
        menu = (LinearLayout)findViewById(R.id.menu);
        planBtn = findViewById(R.id.planBtn);
        progressBtn = findViewById(R.id.progressBtn);



        // Animation
        bgapp.animate().translationY(-1200).setDuration(1000).setStartDelay(300);
        cloverimg.animate().alpha(0).setDuration(1000).setStartDelay(900);
        splashtext.animate().translationY(140).alpha(0).setDuration(1000).setStartDelay(300);
        menu.animate().alpha(1).setStartDelay(900);

        //Button Intent
        planBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, GymPlan.class);
            startActivity(intent);
        });

        progressBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, Progress.class);
            startActivity(intent);
        });
    }
}