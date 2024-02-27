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
        listaRestaurantes.add(new Restaurantes("Manaure Beach","25000","Tiene la mejor gastronomias tipica de Manaure","300725897","calle 1 playas manaure abajo",4,R.drawable.restaurante_1));
    }
}