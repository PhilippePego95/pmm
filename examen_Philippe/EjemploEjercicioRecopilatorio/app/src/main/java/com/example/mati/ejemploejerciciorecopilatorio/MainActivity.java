package com.example.mati.ejemploejerciciorecopilatorio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mati.ejemploejerciciorecopilatorio.R.id.radio;

public class MainActivity extends AppCompatActivity {
    //Lista para el spinner
    private destino[] datos = new destino[]{
            new destino("Megane", "Seat", 20,R.drawable.megan1),
            new destino("X-11", "Ferrari", 100,R.drawable.ferrari1),
            new destino("Leon", "Seat", 30,R.drawable.leon1),
            new destino("Fiesta", "Ford", 40,R.drawable.fiesta1),
    };

    private Object[] calculos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para rellenear el spinner
        AdaptadorZonas adaptador = new AdaptadorZonas(this);
        final Spinner zonas = (Spinner) findViewById(R.id.zonas);
        zonas.setAdapter(adaptador);
        Button total=(Button) findViewById(R.id.button);
        Button calcular = (Button)findViewById(R.id.calcular);
        final RadioGroup tarifas = (RadioGroup)findViewById(R.id.tarifas);
        final Button urgente = (Button)findViewById(R.id.urgente);
        final Button normal = (Button)findViewById(R.id.normal);
        final EditText peso = (EditText)findViewById(R.id.peso);
        final CheckBox caja = (CheckBox)findViewById(R.id.regalo);
        final CheckBox tarjeta = (CheckBox)findViewById(R.id.tarjeta);
        final CheckBox radio = (CheckBox)findViewById(R.id.radio);
        final TextView precio = (TextView)findViewById(R.id.totalPrecio);

        total.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View view){
                double extras=0;
                //Para empezar a pasar de pagina
                Intent paso = new Intent(MainActivity.this, Factura.class);

                //Para pasar objetos
                Bundle pasoobjetos = new Bundle();
                //Precio de la zona y pasar el objeto
                double preciozona = datos[zonas.getSelectedItemPosition()].getPrecio();
                destino Destino = new destino (datos[zonas.getSelectedItemPosition()].getzona(),
                        datos[zonas.getSelectedItemPosition()].getcontinente(),
                        datos[zonas.getSelectedItemPosition()].getPrecio(),
                        datos[zonas.getSelectedItemPosition()].getImagen());
                pasoobjetos.putSerializable("destino", Destino);
                paso.putExtras(pasoobjetos);

                //Precio del peso y pasarlo
                double preciopeso = 0;
                if (peso.getText().toString().isEmpty()){
                    peso.setText("0");
                }
                if (Double.parseDouble(peso.getText().toString()) < 6){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 1;
                }
                if (Double.parseDouble(peso.getText().toString()) >= 6 && Double.parseDouble(peso.getText().toString()) < 10){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 1.5;
                }
                if (Double.parseDouble(peso.getText().toString()) >= 10){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 2;
                }
                paso.putExtra("peso", peso.getText().toString());
                paso.putExtra("preciopeso", String.valueOf(preciopeso));
                double total = (preciozona * preciopeso)/2;

                //Tipo de envoltorio

                boolean checked = false;
                if(caja.isChecked()){
                    checked = true;
                    paso.putExtra("Aire acondicionado", caja.getText().toString());
                    paso.putExtra("checked", checked);
                    total=total+25;
                }
                if(tarjeta.isChecked()){
                    checked = true;
                    paso.putExtra("GPS", tarjeta.getText().toString());
                    paso.putExtra("checked2", checked);
                    total=total+25;
                }
                if(radio.isChecked()){
                    checked = true;
                    paso.putExtra("Radio/DVD", tarjeta.getText().toString());
                    paso.putExtra("checked3", checked);
                    total=total+25;
                }
                //Precio de tarifa y pasarlo
                double tarifa = 0;
                String ntarifa = " ";
                if (tarifas.getCheckedRadioButtonId() == R.id.urgente){
                    ntarifa = urgente.getText().toString();
                    tarifa = (total * 20 ) / 100;
                    ntarifa = urgente.getText().toString();
                }
                if (tarifas.getCheckedRadioButtonId() == R.id.normal){
                    ntarifa = normal.getText().toString();
                    tarifa = 0;
                    ntarifa = normal.getText().toString();
                }
                total=tarifa+total;
                paso.putExtra("nombretarifa", ntarifa);
                paso.putExtra("tarifa", String.valueOf(tarifa));
               // total = total + tarifa;
                paso.putExtra("total", String.valueOf(total));


                //precio.setText(getIntent().getStringExtra("total"));

                //precio.setText(total);
               // startActivity(paso);

                String mensaje = ""+total;
                //Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
                precio.setText(mensaje);

            }
        });
        //Obtener el precio y pasar pantalla
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double extras=0;
                //Para empezar a pasar de pagina
                Intent paso = new Intent(MainActivity.this, Factura.class);

                //Para pasar objetos
                Bundle pasoobjetos = new Bundle();
                //Precio de la zona y pasar el objeto
                double preciozona = datos[zonas.getSelectedItemPosition()].getPrecio();
                destino Destino = new destino (datos[zonas.getSelectedItemPosition()].getzona(),
                        datos[zonas.getSelectedItemPosition()].getcontinente(),
                        datos[zonas.getSelectedItemPosition()].getPrecio(),
                        datos[zonas.getSelectedItemPosition()].getImagen());
                pasoobjetos.putSerializable("destino", Destino);
                paso.putExtras(pasoobjetos);

                //Precio del peso y pasarlo
                double preciopeso = 0;
                if (peso.getText().toString().isEmpty()){
                    peso.setText("0");
                }
                if (Double.parseDouble(peso.getText().toString()) < 6){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 1;
                }
                if (Double.parseDouble(peso.getText().toString()) >= 6 && Double.parseDouble(peso.getText().toString()) < 10){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 1.5;
                }
                if (Double.parseDouble(peso.getText().toString()) >= 10){
                    preciopeso = Double.parseDouble(peso.getText().toString()) * 2;
                }
                paso.putExtra("peso", peso.getText().toString());
                paso.putExtra("preciopeso", String.valueOf(preciopeso));
                double total = (preciozona * preciopeso)/2;

                //Tipo de envoltorio

                boolean checked = false;
                if(caja.isChecked()){
                    checked = true;
                    paso.putExtra("Aire acondicionado", caja.getText().toString());
                    paso.putExtra("checked", checked);
                    total=total+25;
                    extras=extras+50;
                }
                if(tarjeta.isChecked()){
                    checked = true;
                    paso.putExtra("GPS", tarjeta.getText().toString());
                    paso.putExtra("checked2", checked);
                    total=total+25;
                    extras=extras+50;

                }
                if(radio.isChecked()){
                    checked = true;
                    paso.putExtra("Radio/DVD", tarjeta.getText().toString());
                    paso.putExtra("checked3", checked);
                    total=total+25;
                    extras=extras+50;


                }
                //Precio de tarifa y pasarlo
                double tarifa = 0;
                String ntarifa = " ";
                if (tarifas.getCheckedRadioButtonId() == R.id.urgente){
                    ntarifa = urgente.getText().toString();
                    tarifa = (total * 20 ) / 100;
                    ntarifa = urgente.getText().toString();
                }
                if (tarifas.getCheckedRadioButtonId() == R.id.normal){
                    ntarifa = normal.getText().toString();
                    tarifa = 0;
                    ntarifa = normal.getText().toString();
                }
                total=tarifa+total;
                paso.putExtra("extras",extras);
                paso.putExtra("nombretarifa", ntarifa);
                paso.putExtra("tarifa", String.valueOf(tarifa));
                // total = total + tarifa;
                paso.putExtra("total", String.valueOf(total));




                startActivity(paso);
               // String mensaje = "Total = " + total;
               // Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();

            }
        });
    }
    //Menu de Arcerca DE y dibujar
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.acerca:
                Intent acerca = new Intent(MainActivity.this, acercade.class);
                startActivity(acerca);
                return true;
            case R.id.dibujar:
                Intent dibujo = new Intent(MainActivity.this, dibujar.class);
                startActivity(dibujo);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Rellenando el spinner
    public class AdaptadorZonas extends ArrayAdapter<destino> {
        Activity context;

        AdaptadorZonas(Activity context){
            super(context, R.layout.listitem_destino, datos);
            this.context = context;
        }
        public  View getDropDownView (int position, View convertView, ViewGroup parent){
            View vistaDesplegada = getView(position, convertView, parent);
            return  vistaDesplegada;

        }

        public View getView(int i, View convertView, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_destino, null);

            TextView lblTitulo = (TextView) item.findViewById(R.id.LblZona);
            lblTitulo.setText(datos[i].getzona());

            TextView lblSubtitulo = (TextView) item.findViewById(R.id.LblContinente);
            lblSubtitulo.setText(datos[i].getcontinente());

            TextView lblPrecio = (TextView)item.findViewById(R.id.LblPrecio);
            lblPrecio.setText(String.valueOf(datos[i].getPrecio()) + "€");

            ImageView imagen = (ImageView) item.findViewById(R.id.ivImagen);
            imagen.setBackground(getDrawable(datos[i].getImagen()));

            return (item);
        }

    }
}
