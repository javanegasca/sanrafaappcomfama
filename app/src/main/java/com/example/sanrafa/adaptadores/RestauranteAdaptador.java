package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.RestaurantesAmpliados;
import com.example.sanrafa.moldes.Restaurantes;

import java.util.ArrayList;

public class RestauranteAdaptador extends RecyclerView.Adapter<RestauranteAdaptador.viewHolder> {

    public ArrayList<Restaurantes> listaRestaurantes;
    //constructor vacio

    public RestauranteAdaptador() {
    }

    //constructor lleno

    public RestauranteAdaptador(ArrayList<Restaurantes> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public RestauranteAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio los elementos del xml del molde
        ImageView fotomolderestaurante;
        TextView nombrerestaurantemolde;
        TextView preciorestaurantemolde;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomolderestaurante=itemView.findViewById(R.id.fotomolderestaurante);
            nombrerestaurantemolde=itemView.findViewById(R.id.nombrerestaurantemolde);
            preciorestaurantemolde=itemView.findViewById(R.id.preciorestaurantemolde);

        }

        public void pintarMolde(Restaurantes restaurantes) {
            fotomolderestaurante.setImageResource(restaurantes.getFotografia());
            nombrerestaurantemolde.setText(restaurantes.getNombre());
            preciorestaurantemolde.setText(restaurantes.getPrecio());

            //Quiero escuchar click en cada uno de los elementos de la lista
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(itemView.getContext(), RestaurantesAmpliados.class);
                    intent.putExtra("datosrestaurantes",restaurantes);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
