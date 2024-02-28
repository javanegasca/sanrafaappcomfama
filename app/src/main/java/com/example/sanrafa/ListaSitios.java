package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.SitiosAdaptador;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    ArrayList<Sitios> listasitios = new ArrayList<>();
    RecyclerView recyclerViewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        recyclerViewSitios=findViewById(R.id.listadinamicassitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaSitios();
        SitiosAdaptador adaptador= new SitiosAdaptador(listasitios);
        recyclerViewSitios.setAdapter(adaptador);
    }

    public void crearListaSitios(){
        listasitios.add( new Sitios("Santuario de Fauna y Flora Los Flamencos","península de La Guajira","Lunes a viernes de 8:00 a.m. a 5:00 p.m","El Santuario de Flora y Fauna Los Flamencos comprende siete mil hectáreas con representatividad en ecosistemas de humedales conformados por lagunas costeras","50000","Llevar ropa cómoda, zapatos preferiblemente cerrados y protección solar con ingredientes biodegradables, esto para evitar cualquier impacto sobre los ecosistemas y la fauna","320789412",5,R.drawable.santuario_2));
    }
}