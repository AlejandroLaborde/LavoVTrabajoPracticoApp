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
    public SeekBar barMp;
    public TextView barMpNumber;
    public SeekBar msBar;
    public TextView barMsNumber;

    public VisualizarChampionView ( VisualizarChampionActivity activity){
        this.activity = activity;
        this.name = this.activity.findViewById(R.id.nameChamp);
        this.barVida = this.activity.findViewById(R.id.seekBarVida);
        this.image = this.activity.findViewById(R.id.imageChamp);
        this.barVidaValue = this.activity.findViewById(R.id.hpChampNumber);
        this.titleChamp = this.activity.findViewById(R.id.titleChamp);
        this.barMp = this.activity.findViewById(R.id.barMp);
        this.barMpNumber = this.activity.findViewById(R.id.mpChampNumber);
        this.msBar = this.activity.findViewById(R.id.barMs);
        this.barMsNumber = this.activity.findViewById(R.id.msChampNumber);


    }

    public void cargarChampion( Champion champ ){

        Picasso.get().load(champ.icon).into(this.image);
        this.name.setText(champ.name);
        this.titleChamp.setText(champ.title);
        this.barVida.setProgress((int)champ.stats.hp);
        this.barVidaValue.setText(champ.stats.hp+"");
        this.barMp.setProgress((int)champ.stats.mp);
        this.barMpNumber.setText(champ.stats.mp+"");
        this.msBar.setProgress(champ.stats.movespeed);
        this.barMsNumber.setText(champ.stats.movespeed + "");


    }


}
