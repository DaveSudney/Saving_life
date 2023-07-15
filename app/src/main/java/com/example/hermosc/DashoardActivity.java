package com.example.hermosc;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.hermosc.databinding.ActivityDashoardBinding;

import java.util.ArrayList;


public class DashoardActivity extends MainActivity {


    ActivityDashoardBinding activityDashoardBinding;

    LinearLayout card1;
    LinearLayout card2;
    LinearLayout card3;
    LinearLayout card4;
    LinearLayout card5;
    LinearLayout card6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDashoardBinding = ActivityDashoardBinding.inflate(getLayoutInflater());
        setContentView(activityDashoardBinding.getRoot());
        allocateActivityTitle("");

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.img_1,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.photo,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.foto7,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.imgagem05,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.foto6,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.foto8,ScaleTypes.CENTER_CROP));


        ImageSlider imageSlider = findViewById(R.id.slider);
        imageSlider.setImageList(imageList);


        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://salvovidas.com/blog-salvovidascom/")));
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("")));
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/d/u/0/viewer?mid=1s8gU7TwBgBVbE9fO3S7yUfrKP8Yhodiy&ll=-15.164334396476153%2C-51.34523475&z=4")));
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hemosc.org.br/agende-sua-doacao.html")));
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://app.hemosc.org.br/hemosisexterno/login/loginExterno.jsf")));
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hemosc.org.br/eventos-comite-transfusional.html")));
            }
        });
    }

}