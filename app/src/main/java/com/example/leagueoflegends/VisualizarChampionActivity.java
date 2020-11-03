package com.example.leagueoflegends;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VisualizarChampionActivity extends AppCompatActivity {

    public Champion champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_champion);
        this.champion =  MainActivity.champions.get((Integer) getIntent().getExtras().get("Posicion"));

        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(false);
    }
}