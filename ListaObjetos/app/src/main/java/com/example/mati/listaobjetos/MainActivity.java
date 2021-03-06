package com.example.mati.listaobjetos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Titular[] datos;

    public MainActivity() {
        datos = new Titular[]
    
        {
                    new Titular("Sheldon ", "Cooper ", R.drawable.img1),
                    new Titular("Leonard ", "Hofstadter", R.drawable.img2),
                    new Titular("Howard ", "Wolowitz", R.drawable.img3)
        };
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorTitulares adaptador = new AdaptadorTitulares(this);
        ListView lista = (ListView) findViewById(R.id.Lista);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mensaje = "Titulo: " + datos[position].getTitulo() + ".Subtitulo: " + datos[position].getSubtitulo();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }

    public class AdaptadorTitulares extends ArrayAdapter {
        Activity context;

        AdaptadorTitulares(Activity context){
            super(context, R.layout.listar_titular,datos);
            this.context = context;
                    }

        public View getView(int i, View convertView, ViewGroup parent){
            LayoutInflater inflater=context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listar_titular, null);

            TextView IbITitulo = (TextView)item.findViewById(R.id.LblTitulo);
            IbITitulo.setText(datos[i].getTitulo());

            TextView IbISubtitulo = (TextView) item.findViewById(R.id.LblSubTitulo);
            IbISubtitulo.setText(datos[i].getSubtitulo());

            ImageView imagen = (ImageView) item.findViewById(R.id.ivImagen);
            imagen.setBackground(getDrawable(datos[i].getImagen()));

            return (item);
        }

    }


}