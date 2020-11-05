package com.example.leagueoflegends;

import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChampionControler {

    public static void cargarChampionsFromJson(List<Champion> lista , String datos){
        Gson gson = new Gson();
        Champion[] resp = gson.fromJson(datos,Champion[].class);
        if(resp!=null){
            Double minValue=10000.0;
            Double maxValue=0.0;
            for (int i = 0; i < resp.length; i++) {

                try{
                    String asd = resp[i].icon;
                    if(resp[i].stats.hp>maxValue){
                        maxValue = resp[i].stats.hp;
                    }
                    if(resp[i].stats.hp<minValue){
                        minValue = resp[i].stats.hp;
                    }
                    //Le agrego la S porque sino no me deja mostrarla, preguntar pq
                    resp[i].icon=asd.replace("http","https");
                    lista.add(resp[i]);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
            Log.e("MinValue HP", minValue.toString());
            Log.e("MaxValue HP", maxValue.toString());
        }else{
            Log.e("HTTP", "FALLO ALGO EN LA CONEXION");
        }

    }



}
