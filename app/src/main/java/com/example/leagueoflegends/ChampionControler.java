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

    public static void cargarChampions(List<Champion> lista ){
        lista.add(new Champion("Garen","https://ddragon.leagueoflegends.com/cdn/10.22.1/img/champion/Garen.png"));
        lista.add(new Champion("Atrox","https://ddragon.leagueoflegends.com/cdn/10.22.1/img/champion/Aatrox.png"));
        lista.add(new Champion("Ashe","https://ddragon.leagueoflegends.com/cdn/10.22.1/img/champion/Ashe.png"));
        lista.add(new Champion("Kennen", "https://ddragon.leagueoflegends.com/cdn/10.22.1/img/champion/Kennen.png"));
    }

    public static void cargarChampionsFromJson(List<Champion> lista , String datos){
        Log.e("Entro", "Entro");
        Gson gson = new Gson();
        Champion[] resp = gson.fromJson(datos,Champion[].class);
        if(resp!=null){
            for (int i = 0; i < resp.length; i++) {
                Log.e("entro for", i + "");
                try{
                    String asd = resp[i].icon;
                    resp[i].icon=asd.replace("http","https");
                    lista.add(resp[i]);
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        }else{
            Log.e("es null", "es null");
        }

    }



}
