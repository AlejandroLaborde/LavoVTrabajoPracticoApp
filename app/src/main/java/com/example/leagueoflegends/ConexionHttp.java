package com.example.leagueoflegends;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConexionHttp {

    public String obtenerRespuesta( String url) {

        try{
            URL urlApi = new URL(url);
            HttpURLConnection urlConnection = (HttpURLConnection) urlApi.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            Log.e("asd",urlConnection.getResponseCode()+"");
            if( 200 == urlConnection.getResponseCode()){
                InputStream is = urlConnection.getInputStream();
                ByteArrayOutputStream  baos= new ByteArrayOutputStream();
                byte[] buffer =  new byte[1024];
                int length = 0;

                while ((length = is.read( buffer ))!=-1){
                    baos.write(buffer,0,length);
                }

                is.close();
                Log.e("asd",baos.toString());
                return baos.toString();

            }else{
                Log.e("fallo","fallo conexion");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }


}
