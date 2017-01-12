package com.example.mati.ejemplobasedatosini;

/**
 * Created by mati on 11/01/17.
 */

public class Cliente {
    String nombre;
    String telefon;
    public Cliente(String nombre, String telefon){
        this.nombre=nombre;
        this.telefon=telefon;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTelefon(){
        return telefon;
    }
}
