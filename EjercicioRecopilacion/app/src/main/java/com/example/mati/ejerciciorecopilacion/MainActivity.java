package com.example.mati.ejerciciorecopilacion;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mati.ejerciciorecopilacion.R.layout.listem_titular;

public class MainActivity extends AppCompatActivity {
    public Spinner miSpinner;
private Titular[] datos = new Titular[]{
        new Titular("Zona 1 Europa","10€"),
        new Titular("Zona 2 Europa","20€"),
        new Titular("Zona 3 Europa","30€")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miSpinner = (Spinner)findViewById(R.id.spinner);
        AdaptadorPersona miAdaptador = new AdaptadorPersona(this);
        miSpinner.setAdapter(miAdaptador);

        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String sms = "";
                sms= "item clicked ->"+ datos[position];
                showToast(sms);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void showToast(String text){
        Toast.makeText(this,text, Toast.LENGTH_SHORT).show();
    }
    class AdaptadorPersona extends ArrayAdapter<Titular>{
        public Activity miActividad;

        public AdaptadorPersona(Activity listem_titular){
        super(miActividad, listem_titular, datos);
        this.miActividad=listem_titular;
       }
        public View getDropDownView(int position, View convertView, ViewGroup parent){
            View vistaDesplegada = getView(position,convertView,parent);
            return vistaDesplegada;
        }
        public View getView(int position,View convertView, ViewGroup parent){
            LayoutInflater inflater = miActividad.getLayoutInflater();
            View item = inflater.inflate(R.layout.listem_titular,null);

            TextView LblTitulo= (TextView) item.findViewById(R.id.LblTitulo);
            TextView LblSubTitulo= (TextView) item.findViewById(R.id.LblSubTitulo);

            LblTitulo.setText(datos[position].getTitulo());
            LblSubTitulo.setText(datos[position].getSubtitulo());

            return item;
        }
    }
///Menu

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.acerca:
                Intent acerca = new Intent(MainActivity.this,acercade.class);
                startActivity(acerca);
                return true;
            case R.id.dibujar:
                Intent dibujar = new Intent(MainActivity.this,dibujar.class);
                startActivity(dibujar);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
