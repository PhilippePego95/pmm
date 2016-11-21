package com.example.mati.ejemploejerciciorecopilatorio;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dibujar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new dibuixar (this));

        /*Button volver = (Button) findViewById(R.id.volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(dibujar.this, MainActivity.class);
                startActivity(volver);
            }
        });*/
    }

    public class dibuixar extends View {
        public dibuixar(Context contexto) {
            super(contexto);
        }

        protected void onDraw(Canvas canvas) {
            Paint cuadro = new Paint();
            cuadro.setColor(Color.YELLOW);
            cuadro.setStrokeWidth(30);
            cuadro.setStyle(Paint.Style.STROKE);
            canvas.drawRect(150,300,1200,850,cuadro);

          Paint finestra = new Paint();
            finestra.setColor(Color.BLACK);
            finestra.setStrokeWidth(30);
            finestra.setStyle(Paint.Style.STROKE);
           canvas.drawLine(400,300,400,500,finestra);

            Paint finestra2 = new Paint();
            finestra2.setColor(Color.BLACK);
            finestra2.setStrokeWidth(30);
            finestra2.setStyle(Paint.Style.STROKE);
            canvas.drawLine(400,500,100,500,finestra2);

            this.setBackgroundColor(Color.WHITE);
            Paint pincel1 = new Paint();
            pincel1.setColor(Color.RED);
            pincel1.setStrokeWidth(30);
            pincel1.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(1050, 800, 150, pincel1);

            this.setBackgroundColor(Color.WHITE);
            Paint pincel2 = new Paint();
            pincel2.setColor(Color.RED);
            pincel2.setStrokeWidth(30);
            pincel2.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(300, 800, 150, pincel2);


/*
           Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(30);
            pincel.setStyle(Paint.Style.STROKE);
          canvas.drawPoint(500, 500, pincel);




         /*   Paint cuadro = new Paint();
            cuadro.setColor(Color.YELLOW);
            cuadro.setStrokeWidth(200);
            cuadro.setStyle(Paint.Style.STROKE);
           canvas.drawRect(150,800,200,850,cuadro);

            Paint cuadro1 = new Paint();
            cuadro1.setColor(Color.WHITE);
            cuadro1.setStrokeWidth(200);
            cuadro1.setStyle(Paint.Style.STROKE);
            canvas.drawRect(800,150,850,200,cuadro1);

            Paint cuadro2 = new Paint();
            cuadro2.setColor(Color.MAGENTA);
            cuadro2.setStrokeWidth(200);
            cuadro2.setStyle(Paint.Style.STROKE);
            canvas.drawRect(150,150,200,200,cuadro2);

            Paint cuadro3 = new Paint();
            cuadro3.setColor(Color.RED);
            cuadro3.setStrokeWidth(200);
            cuadro3.setStyle(Paint.Style.STROKE);
            canvas.drawRect(800,800,850,850,cuadro3);
            */
        }
    }
}