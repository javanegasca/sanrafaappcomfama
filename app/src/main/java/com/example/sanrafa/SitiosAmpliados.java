package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Sitios;

public class SitiosAmpliados extends AppCompatActivity {

    Sitios datossitios;
    TextView titulositios;
    ImageView imagenSitios;
    TextView Calificacion;
    TextView Telefono;
    TextView Descripcion;
    TextView Direccion;
    TextView Precio;
    TextView Horario;
    TextView Recomendaciones;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        titulositios=findViewById(R.id.tituloampliadositios);
        imagenSitios=findViewById(R.id.fotoampliandositios);
        Calificacion=findViewById(R.id.calificacionsitios);
        Telefono=findViewById(R.id.telefonositios);
        Descripcion=findViewById(R.id.descripcionsitios);
        Direccion=findViewById(R.id.direccionsitios);
        Precio=findViewById(R.id.telefonositios);
        Horario=findViewById(R.id.Horariositios);
        Recomendaciones=findViewById(R.id.recomendacionsitios);

        datossitios=(Sitios)getIntent().getSerializableExtra("datossitios");
        Toast.makeText(this, datossitios.getNombre(), Toast.LENGTH_SHORT).show();

        titulositios.setText(datossitios.getNombre());
        imagenSitios.setImageResource(datossitios.getFotografia());
        Calificacion.setText(datossitios.getCalificacion());
        Telefono.setText(datossitios.getTelefeno());
        Descripcion.setText(datossitios.getDescripcion());
        Direccion.setText(datossitios.getDireccion());
        Precio.setText(datossitios.getPrecio());
        Horario.setText(datossitios.getHorario());
        Recomendaciones.setText(datossitios.getRecomendaciones());
    }
}