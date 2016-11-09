package com.example.mati.dibujo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new EjemploView(this));
    }
    public class EjemploView extends View {
        public EjemploView(Context contexto){
            super(contexto);
        }
        protected void onDraw(Canvas canvas){

            this.setBackgroundColor(Color.BLACK);

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(30);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawPoint(500,500,pincel);

            Paint pincel1 = new Paint();
            pincel1.setColor(Color.RED);
            pincel1.setStrokeWidth(30);
            pincel1.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(500,500,200,pincel1);

/* con puntos

            Paint pincel2 = new Paint();
            pincel2.setColor(Color.GREEN);
            pincel2.setStrokeWidth(200);
            pincel2.setStyle(Paint.Style.STROKE);
            canvas.drawPoint(200,200,pincel2);

            Paint pincel3 = new Paint();
            pincel3.setColor(Color.YELLOW);
            pincel3.setStrokeWidth(200);
            pincel3.setStyle(Paint.Style.STROKE);
            canvas.drawPoint(800,200,pincel3);

            Paint pincel4 = new Paint();
            pincel4.setColor(Color.CYAN);
            pincel4.setStrokeWidth(200);
            pincel4.setStyle(Paint.Style.STROKE);
            canvas.drawPoint(800,800,pincel4);

            Paint pincel5 = new Paint();
            pincel5.setColor(Color.MAGENTA);
            pincel5.setStrokeWidth(200);
            pincel5.setStyle(Paint.Style.STROKE);
            canvas.drawPoint(200,800,pincel5);
*/

            Paint cuadro = new Paint();
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
        }

    }
}
