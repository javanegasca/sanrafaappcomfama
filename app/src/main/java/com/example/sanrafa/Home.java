package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}