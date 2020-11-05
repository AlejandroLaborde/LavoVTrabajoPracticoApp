package com.example.leagueoflegends;

import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class VisualizarChampionView {

    public VisualizarChampionActivity activity;
    public TextView name;
    public TextView titleChamp;
    public ImageView image;
    public SeekBar barVida;
    public TextView barVidaValue;

    public VisualizarChampionView ( VisualizarChampionActivity activity){
        this.activity = activity;
        this.name = this.activity.findViewById(R.id.nameChamp);
        this.barVida = this.activity.findViewById(R.id.seekBarVida);
        this.image = this.activity.findViewById(R.id.imageChamp);
        this.barVidaValue = this.activity.findViewById(R.id.hpChampNumber);
        this.titleChamp = this.activity.findViewById(R.id.titleChamp);



    }

    public void cargarChampion( Champion champ ){
        this.name.setText(champ.name);
        this.titleChamp.setText(champ.title);
        this.barVida.setProgress((int)champ.stats.hp);
        this.barVidaValue.setText(champ.stats.hp+"");

        this.barVida.setActivated(false);

        Picasso.get().load(champ.icon).into(this.image);
    }



}
