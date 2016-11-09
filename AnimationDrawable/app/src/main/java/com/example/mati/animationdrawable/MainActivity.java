package com.example.mati.animationdrawable;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    AnimationDrawable animacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        animacion = (AnimationDrawable) getResources().getDrawable(R.anim.animacion);
        ImageView imagen = new ImageView(this);
        imagen.setBackgroundColor(Color.WHITE);
        imagen.setImageDrawable(animacion);
        setContentView(imagen);
    }
    public boolean onTouchEvent(MotionEvent evento){
        if (evento.getAction()==MotionEvent.ACTION_DOWN){
            animacion.start();
            return true;
        }
        return super.onTouchEvent(evento)
    }
}
