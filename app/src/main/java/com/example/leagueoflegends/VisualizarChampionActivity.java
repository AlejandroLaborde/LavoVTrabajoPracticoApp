package com.example.leagueoflegends;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class VisualizarChampionActivity extends AppCompatActivity {

    public Champion champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_champion);
        this.champion =  MainActivity.champions.get((Integer) getIntent().getExtras().get("Posicion"));
        Gson asd = new Gson();
        Log.d("Champion a mostrar",asd.toJson(this.champion));
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(false);
        VisualizarChampionView championView = new VisualizarChampionView(this);
        championView.cargarChampion(this.champion);
    }
}