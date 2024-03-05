package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.RestauranteAdaptador;
import com.example.sanrafa.moldes.Restaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Restaurantes>listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerViewRestaurantes=findViewById(R.id.listadinamicasrestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));

        crearListaRestaurantes();
        RestauranteAdaptador adaptador = new RestauranteAdaptador(listaRestaurantes);
        recyclerViewRestaurantes.setAdapter(adaptador);
    }

    public void crearListaRestaurantes(){
        listaRestaurantes.add(new Restaurantes("Manaure Beach","Platos desde $25000 Cop","onde podemos apreciar las pilas de sal, degustar pescados frescos, variedades de mariscos, ofrecemos también lo mejor de nuestra gastronomía wayuu. Contamos con grandes espacios para la realización de eventos y toda clase de reuniones dentro de nuestras instalaciones.","Nuestras líneas de atención son: 300725897","calle 1 playas manaure abajo",4,R.drawable.manaurebeach));
        listaRestaurantes.add(new Restaurantes("Restaurante & Estadero Supüna Ichii","Platos desde $17000 COP","Un lugar maravilloso en Manaure, donde tenemos la mejor atención, y donde podrás disfrutar de un hermoso atardecer","Nustra línea de atención es: 3016501482","Manaure Limon",5,R.drawable.supuha));
        listaRestaurantes.add(new Restaurantes("Restaurante Mono Robles","Platos desde $15000 COP","Un restaurante muy acogedor, con una excelente gastronomia tipica de la guajira, y con la posibiliad de compartir con los nativos de la zona","Nuestra linea de atención es: 3116961410","Playas de Manaure",4,R.drawable.mono));
        listaRestaurantes.add(new Restaurantes("Restaurane la Negra","Platos desde $12000 COP","Imagina una combinación de comidas grandiosas con un personal agradable: eso es exactamente lo que este restaurante te brinda. Su abnegado servicio es siempre un placer. Según el criterio de los usuarios, sus precios son razonables. Ven aquí si buscas una atrayente atmósfera. Pero muchos asiduos que usan Google no le dieron a Restaurante La Negra una nota muy alta.","Nuestra línea de atención es: 3107026050","Manaure-Uribia",3,R.drawable.lanegra));
        listaRestaurantes.add(new Restaurantes("Restaurante Playa Isaashi","Platos desde $25000 COP","servicio de restaurante con una amplia carta de platos de comida típica de la región, todo para ofrecer una experiencia única de turismo ecológico, gastronómico y cultural","Nuestra línea de atención son: 3126837316","ubicado a 3,5 kilómetros de Mayapo, pueblo indígena wayuu a solo 30 minutos de Riohacha",5,R.drawable.isashi));

    }
}