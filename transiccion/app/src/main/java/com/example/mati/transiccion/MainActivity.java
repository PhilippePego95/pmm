package com.example.mati.transiccion;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imagen = new ImageView(this);
        setContentView(imagen);
        TransitionDrawable mi_transicion = (TransitionDrawable)
                getResources().getDrawable(R.drawable.transicio);
        imagen.setImageDrawable(mi_transicion);
        mi_transicion.startTransition(2000);
    }
}
