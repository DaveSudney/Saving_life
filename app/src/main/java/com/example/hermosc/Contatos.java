package com.example.hermosc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hermosc.databinding.ActivityContatosBinding;


public class Contatos extends MainActivity {

    ActivityContatosBinding activityContatosBinding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
           activityContatosBinding = activityContatosBinding.inflate(getLayoutInflater());
            setContentView(activityContatosBinding.getRoot());
           allocateActivityTitle("Contatos");
    }

}