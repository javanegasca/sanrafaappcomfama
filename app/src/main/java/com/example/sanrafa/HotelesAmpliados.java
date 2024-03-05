package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;
    TextView tituloHotel;
    ImageView imagenHotel;
    TextView Calificacion;
    TextView Telefono;
    TextView Descripcion;
    TextView Direccion;
    TextView Precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        tituloHotel=findViewById(R.id.tituloampliadohoteles);
        imagenHotel=findViewById(R.id.fotoampliandohoteles);
        Calificacion=findViewById(R.id.calificacionampliandohoteles);
        Telefono=findViewById(R.id.telefonoampliandohoteles);
        Descripcion=findViewById(R.id.descripcionampliandohoteles);
        Direccion=findViewById(R.id.direccionampliandohoteles);
        Precio=findViewById(R.id.precioampliandohoteles);




        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, datoshotel.getNombre(), Toast.LENGTH_SHORT).show();
        tituloHotel.setText(datoshotel.getNombre());
        imagenHotel.setImageResource(datoshotel.getFotografia());
        Calificacion.setText(Integer.toString(datoshotel.getCalificacion()));
        Telefono.setText((datoshotel.getTelefono()));
        Descripcion.setText(datoshotel.getDescripcion());
        Precio.setText(datoshotel.getPrecio());
        Direccion.setText((datoshotel.getDireccion()));
    }
}