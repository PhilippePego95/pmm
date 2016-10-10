package com.example.mati.linerlayoutact1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton verd = (RadioButton) findViewById(R.id.bverd);
        RadioButton roig = (RadioButton) findViewById(R.id.broig);
        RadioButton blau = (RadioButton) findViewById(R.id.bblau);

       final TextView mostrar = (TextView) findViewById(R.id.color);

        Button añadir = (Button) findViewById(R.id.bañadir);
        Button borrar = (Button) findViewById(R.id.bborrar);

        final RadioGroup grup = (RadioGroup) findViewById(R.id.gcolor);

        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (grup.getCheckedRadioButtonId()==R.id.bblau){
                    int blau = Color.parseColor("#FF67ACF1");
                    mostrar.setBackgroundColor(blau);

                }
                if (grup.getCheckedRadioButtonId()==R.id.broig){
                    int roig = Color.parseColor("#FFEC0000");
                    mostrar.setBackgroundColor(roig);

                }if (grup.getCheckedRadioButtonId()==R.id.bverd){
                    int verd = Color.parseColor("#FF2FD911");
                    mostrar.setBackgroundColor(verd);

                }
          }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int blanc = Color.parseColor("#FFFFFF");
                mostrar.setBackgroundColor(blanc);
            }
        });
    }
}
