package com.example.leagueoflegends;

import java.util.List;

public class Champion {
    public String id;
    public String key;
    public String name;
    public String title;
    public List<String> tags;
    public Stats stats;
    public String icon;
    public Sprite sprite;
    public String description;

    public Champion(String nombre, String urlImage) {
        this.name = nombre;
        this.icon = urlImage;
    }

    public class Stats{
        public double hp;
        public int hpperlevel;
        public double mp;
        public double mpperlevel;
        public int movespeed;
        public double armor;
        public double armorperlevel;
        public double spellblock;
        public double spellblockperlevel;
        public int attackrange;
        public double hpregen;
        public double hpregenperlevel;
        public double mpregen;
        public double mpregenperlevel;
        public int crit;
        public int critperlevel;
        public double attackdamage;
        public double attackdamageperlevel;
        public double attackspeedperlevel;
        public double attackspeed;
    }

    public class Sprite{
        public String url;
        public int x;
        public int y;
    }
}
