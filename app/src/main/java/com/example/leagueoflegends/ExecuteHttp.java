package com.example.leagueoflegends;


import android.os.Handler;
import android.os.Message;

public class ExecuteHttp extends Thread {

    Handler handler;

    public ExecuteHttp(Handler handler) {
        this.handler = handler;
    }

    public  void run(){
        ConexionHttp as = new ConexionHttp();
        String resp = as.obtenerRespuesta("https://raw.githubusercontent.com/ngryman/lol-champions/master/champions.json");

        Message msg = new Message();
        msg.obj = resp;
        this.handler.sendMessage(msg);
    }
}
