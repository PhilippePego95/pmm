package com.example.mati.tablelayoutact2;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;
        final TextView mostrar = (TextView) findViewById(R.id.textView);
        Button roig = (Button)findViewById(R.id.Roig);
        Button blau = (Button)findViewById(R.id.Blau);
        Button groc = (Button)findViewById(R.id.Groc);
        Button borrar = (Button)findViewById(R.id.Borrar);

        roig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar.setBackgroundColor(ContextCompat.getColor(context, R.color.Roig));
                //int roig = Color.parseColor("#FF0000");
               // mostrar.setBackgroundColor(roig);
            }
        });
        blau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar.setBackgroundColor(ContextCompat.getColor(context, R.color.Blau));
                //   int blau = Color.parseColor("#FF03ABFF");
               // mostrar.setBackgroundColor(blau);
            }
        });
        groc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar.setBackgroundColor(ContextCompat.getColor(context, R.color.Groc));
                // int groc = Color.parseColor("#FFFFF200");
               // mostrar.setBackgroundColor(groc);
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar.setBackgroundColor(ContextCompat.getColor(context, R.color.Negre));
               // int blanc = Color.parseColor("#000000");
               // mostrar.setBackgroundColor(blanc);
            }
        });
    }
}
