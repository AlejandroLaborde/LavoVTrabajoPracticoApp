package com.example.leagueoflegends;

import android.widget.TextView;

public class VisualizarChampionView {

    public VisualizarChampionActivity activity;
    public TextView name;
    public VisualizarChampionView ( VisualizarChampionActivity activity){
        this.activity = activity;
        this.name = this.activity.findViewById(R.id.nameChamp);

    }

    public void cargarChampion( Champion champ ){

    }



}
