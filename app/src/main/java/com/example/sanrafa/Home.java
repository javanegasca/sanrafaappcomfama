package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

   // Atributos para referencias elementos gráficos.
    // Que tengo yo en el .xml que quiero controlar en java

    Button BotonHoteles;
    Button BotonRestaurantes;
    Button BotonSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Asociar las variables creadas con los Id de los elementos que vienen desde .xml

        BotonHoteles=findViewById(R.id.botonHoteles);
        BotonRestaurantes=findViewById(R.id.botonRestaurantes);
        BotonSitios=findViewById(R.id.botonSitios);

        //Escuchar eventos (click en los botones)
        BotonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Acá escribo lo que quiera hacer presionen el botón.

                Toast.makeText(Home.this, "Hizo click en Hoteles", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent(Home.this, Hoteles.class);
                startActivity(intent);
            }
        });

        BotonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo click en Restaurantes", Toast.LENGTH_SHORT).show();
            }
        });

        BotonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo click en Sitios Turisticos", Toast.LENGTH_SHORT).show();
            }
        });


    }
    //Cargar el menú de opciones deseado
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Qué hago en cada opción del menú
    public boolean onOptionsItemSelected(MenuItem item){
        int itemseleccionado=item.getItemId();
     if (itemseleccionado==R.id.opcion1){
         Toast.makeText(this, "Presiono opción 1", Toast.LENGTH_SHORT).show();

     }else if(itemseleccionado==R.id.opcion2){
         Toast.makeText(this, "Presiono opción 2", Toast.LENGTH_SHORT).show();

     } else if (itemseleccionado==R.id.opcion3) {


     } else if (itemseleccionado==R.id.opcion4) {
         Intent intentResena = new Intent(Home.this,Resena.class);
         startActivity(intentResena);

     } else if (itemseleccionado==R.id.opcion5) {
         Toast.makeText(this, "Presiono opción 5", Toast.LENGTH_SHORT).show();

     }
     return super.onOptionsItemSelected(item);
    }
}