package com.example.hermosc;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.hermosc.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   
    DrawerLayout drawerLayout;




    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_main, null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);


        Toolbar toolbar = drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.menu_drawer_open, R.string.menu_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {
            case R.id.itemInicio:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemGroupesanguineo:
                startActivity(new Intent(this, BloodtypesActivity.class));
                overridePendingTransition(0, 0);
                break;
                case R.id.itemSair:
                    startActivity(new Intent(this, WelcomeActivity.class));
                    overridePendingTransition(0, 0);
                    break;
            case R.id.itemContato:
                startActivity(new Intent(this, Contatos.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemEvento:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemAgenda:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemEstoque:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemNoticias:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
            case R.id.itemLocal:
                startActivity(new Intent(this, DashoardActivity.class));
                overridePendingTransition(0, 0);
                break;
        }
        return false;
    }

    protected void allocateActivityTitle(String titleString) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(titleString);
        }




        }

        }






