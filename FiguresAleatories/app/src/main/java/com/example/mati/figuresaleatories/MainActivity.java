package com.example.mati.figuresaleatories;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new VistaMedida(this));
    }
    public class  VistaMedida extends View{
        private ShapeDrawable miDrewable;
        public  VistaMedida(Context context){
            super(context);
            int x=10, y =10;
            int ancho=300, alto = 50;
            miDrewable = new ShapeDrawable(new OvalShape());
            miDrewable.getPaint().setColor(0xff0000ff);
            miDrewable.setBounds(x,y,x+ancho,y+alto);
        }         protected void onDraw(Canvas canvas){
            miDrewable.draw(canvas);
        }
    }
}
