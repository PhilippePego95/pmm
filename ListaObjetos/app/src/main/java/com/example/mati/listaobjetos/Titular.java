package com.example.mati.listaobjetos;

/**
 * Created by mati on 19/10/16.
 */

public class Titular {
    private  String titulo;
    private  String subtitulo;
    private int imagen;

    public Titular (String tit, String sub, int img){
        titulo = tit;
        subtitulo = sub;
        imagen = img;
    }
    public String getTitulo() {return titulo;}
    public String getSubtitulo() {return subtitulo;}
    public int getImagen(){return imagen;}

}
