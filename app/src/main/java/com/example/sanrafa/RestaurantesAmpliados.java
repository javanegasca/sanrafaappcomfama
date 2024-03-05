package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurantes;

public class RestaurantesAmpliados extends AppCompatActivity {
    Restaurantes datosrestaurantes;

    TextView tituloRestaurante;
    ImageView imagenRestaurante;
    TextView CalificacionRestaurante;
    TextView TelefonoRestaurante;
    TextView DescripcionRestaurante;
    TextView DireccionRestaurante;
    TextView PrecioRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        tituloRestaurante=findViewById(R.id.tituloampliadorestaurantes);
        imagenRestaurante=findViewById(R.id.fotoampliandorestaurantes);
        CalificacionRestaurante=findViewById(R.id.calificacionrestaurantes);
        TelefonoRestaurante=findViewById(R.id.telefonorestaurantes);
        DescripcionRestaurante=findViewById(R.id.descripcionrestaurantes);
        DireccionRestaurante=findViewById(R.id.direccionrestaurantes);
        PrecioRestaurante=findViewById(R.id.preciorestaurantes);

        datosrestaurantes=(Restaurantes)getIntent().getSerializableExtra("datosrestaurantes");
        Toast.makeText(this, datosrestaurantes.getNombre(), Toast.LENGTH_SHORT).show();
        tituloRestaurante.setText(datosrestaurantes.getNombre());
        imagenRestaurante.setImageResource(datosrestaurantes.getFotografia());
        CalificacionRestaurante.setText(Integer.toString(datosrestaurantes.getCalificacion()));
        TelefonoRestaurante.setText(datosrestaurantes.getTelefono());
        DireccionRestaurante.setText(datosrestaurantes.getDireccion());
        DescripcionRestaurante.setText(datosrestaurantes.getDescripcion());
        PrecioRestaurante.setText(datosrestaurantes.getPrecio());


    }
}