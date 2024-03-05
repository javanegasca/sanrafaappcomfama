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
        listaHoteles.add(new Hotel("Hoteles del mar vendra"," Habitaciones desde 300000 COP","Del Mar Vendra dispone de jardín, terraza, restaurante y bar en Manaure Viejo. El alojamiento ofrece servicio de habitaciones, servicio de conserjería y servicio de organización de tours.\n" +
                "                        Las habitaciones de este alojamiento están equipadas con baño privado y wifi gratis. Algunas habitaciones están equipadas con vistas a la ciudad.\n","Nuestras lineas de atención son 300528978","a 25km del aereopuerto de Rioacha",4,R.drawable.hotel_3));

        listaHoteles.add(new Hotel("Wayira beach","Habitaciones desde 500000 COP","Experiencias memorables en las vacaciones o días de descanso.\n >Hotel en frente de la playa donde podras disfrutar tus vacaciones con tranquilidad y privacidad. \n Nuestro todo incluido. Tiquetes, hoteles, comida, bebida y tarjeta de asistencia médica. ","Nuestras lineas de atención son: 304789632","a 30 minutos del aeropuerto de Riohacha",5,R.drawable.hotel_2));
        listaHoteles.add(new Hotel("Hotel Palaaima","Habitaciones desde 100000 COP","en su entorno podrá disfrutar de la explotación artesanal e industrial de las \"Salinas de Manaure\" y el lugar de paso de los Flamencos Rosados (Musichi), además podrá disfrutar de la comodidad de ser atendido en un ambiente familiar. ","Nuestras Lineas de atención son: 300285798","carrera 6 N° 7- 34 Manaure (La Guajira) a orilla del Mar Caribe",3,R.drawable.hotel_4));
    }

}