package com.example.mati.ejerciciorecopilacion;

/**
 * Created by mati on 16/11/16.
 */

public class Titular {
    private String titulo;
    private String subtitulo;

    public Titular(String tit, String sub){
        titulo=tit;
        subtitulo=sub;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getSubtitulo(){
        return subtitulo;
    }
}
