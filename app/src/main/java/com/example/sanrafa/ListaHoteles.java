package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.HotelAdaptador;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicashoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador= new HotelAdaptador(listaHoteles);
        recyclerViewHoteles.setAdapter(adaptador);

    }

    public void crearListaHoteles(){
        listaHoteles.add(new Hotel("Hoteles del mar vendra","300000","hotel con la mejor vista al mar","300528978","a 25km del aereopuerto de Rioacha",4,R.drawable.hotel_3));
        listaHoteles.add(new Hotel("Wayira beach","500000","El mejor hotel de la Guajira ","304789632","a 70km del aereopuerto de Rioacha",5,R.drawable.hotel_2));
        listaHoteles.add(new Hotel("Hotel Palaaima","100000","El mejor hotel con ambiente familiar en Manaure ","300285798","a 45km del aereopuerto de Rioacha",2,R.drawable.hotel_4));
    }

}