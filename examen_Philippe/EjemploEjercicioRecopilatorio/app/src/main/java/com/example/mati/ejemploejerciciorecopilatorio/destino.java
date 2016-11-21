package com.example.mati.ejemploejerciciorecopilatorio;

import java.io.Serializable;

public class destino implements Serializable{
    private  String zona;
    private  String continente;
    private  double precio;
    private  int imagen;

    public destino (String zona, String continente, double precio, int img){
        this.zona = zona;
        this.continente = continente;
        this.precio = precio;
        this.imagen=img;
    }

    public  String getzona (){
        return zona;
    }
    public  String getcontinente (){
        return continente;
    }
    public  double getPrecio (){
        return precio;
    }
    public int getImagen(){ return imagen;  }
}
