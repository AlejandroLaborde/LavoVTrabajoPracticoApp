package com.example.leagueoflegends;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback {

    public static List<Champion> champions = new ArrayList<>();
    private ChampionAdapter championAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler(this);
        ExecuteHttp asd = new ExecuteHttp(handler);
        asd.run();
        asd.start();
        this.championAdapter= new ChampionAdapter(champions,this);
        RecyclerView rb = findViewById(R.id.reciclerView);
        rb.setAdapter(this.championAdapter);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,4);

        rb.setLayoutManager(linearLayoutManager);

    }

    @Override
    public boolean handleMessage(@NonNull Message msg) {
        Log.d("Llego aca",msg.obj.toString());

        ChampionControler.cargarChampionsFromJson(champions,msg.obj.toString());
        Log.d("D",msg.obj.toString());
        this.championAdapter.notifyDataSetChanged();
        return false;
    }

    public void mostrarDetalles( Integer posicion ){

        Intent i = new Intent(this, VisualizarChampionActivity.class);
        i.putExtra("Posicion",posicion);
        startActivity(i);
    }





}