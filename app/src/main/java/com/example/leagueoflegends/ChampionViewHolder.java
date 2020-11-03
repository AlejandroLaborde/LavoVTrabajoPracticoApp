package com.example.leagueoflegends;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChampionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView nombre;
    public ImageView imagen;
    public MainActivity activity;
    public Integer indice;

    public ChampionViewHolder(@NonNull View itemView, MainActivity activity) {
        super(itemView);
        this.activity = activity;
        this.nombre =itemView.findViewById(R.id.name);
        this.imagen = itemView.findViewById(R.id.imageChampion);
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    @Override
    public void onClick(View v) {
        Log.d("Click indice","Click" + this.nombre.getText());
        this.activity.mostrarDetalles(this.indice);

    }
}
