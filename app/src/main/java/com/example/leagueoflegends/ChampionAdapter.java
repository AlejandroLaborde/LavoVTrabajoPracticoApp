package com.example.leagueoflegends;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static java.security.AccessController.getContext;

public class ChampionAdapter extends  RecyclerView.Adapter<ChampionViewHolder> {

    private List<Champion> champions;
    private  MainActivity mainActivity;

    public ChampionAdapter ( List<Champion> champions, MainActivity mainActivity ){
        this.champions = champions;
        this.mainActivity = mainActivity;
    }
    @NonNull
    @Override
    public ChampionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.champion_view, parent, false);
        ChampionViewHolder champViewHolder = new ChampionViewHolder(item,this.mainActivity);
        item.setOnClickListener(champViewHolder);
        return champViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChampionViewHolder holder, int position) {
        holder.indice = position;
        holder.nombre.setText( this.champions.get(position).name );
        Picasso.get().load(this.champions.get(position).icon).into(holder.imagen);

    }

    @Override
    public int getItemCount() {
        return this.champions.size();
    }
}
