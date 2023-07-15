package com.example.hermosc;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hermosc.databinding.ActivityBloodtypesBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BloodtypesActivity extends MainActivity {


    ActivityBloodtypesBinding activityBloodtypesBinding;

    LinearLayout group1;
    LinearLayout group2;
    LinearLayout group3;
    LinearLayout group4;
    LinearLayout group5;
    LinearLayout group6;
    LinearLayout group7;
    LinearLayout group8;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBloodtypesBinding = activityBloodtypesBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_bloodtypes);
        setContentView(activityBloodtypesBinding.getRoot());
        allocateActivityTitle("Consultar grupo sanguineo");


        imageView = findViewById(R.id.Avatar);


        group1 = findViewById(R.id.grupo1);
        group2 = findViewById(R.id.grupo2);
        group3 = findViewById(R.id.grupo3);
        group4 = findViewById(R.id.grupo4);
        group5 = findViewById(R.id.grupo5);
        group6 = findViewById(R.id.grupo6);
        group7 = findViewById(R.id.grupo7);
        group8 = findViewById(R.id.grupo8);



        group1.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_6);
        });
        group2.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_7);
        });
        group3.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_12);
        });
        group4.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_14);
        });
        group5.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_8);
        });
        group6.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_9);
        });
        group7.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_11);
        });
        group8.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.img_10);
        });

    }
}











