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
import com.example.sanrafa.SitiosAmpliados;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.viewHolder> {

    public ArrayList<Sitios> listaSitios;

    //constructor vacio

    public SitiosAdaptador() {
    }

    //constructor lleno

    public SitiosAdaptador(ArrayList<Sitios> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public SitiosAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull SitiosAdaptador.viewHolder holder, int position) {
        holder.pintarMolde(listaSitios.get(position));

    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotomoldesitios;
        TextView nombresitiomolde;
        TextView preciositiomolde;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldesitios=itemView.findViewById(R.id.fotomoldesitios);
            nombresitiomolde=itemView.findViewById(R.id.nombresitiomolde);
            preciositiomolde=itemView.findViewById(R.id.preciositiomolde);
        }

        public void pintarMolde(Sitios sitios) {
            fotomoldesitios.setImageResource(sitios.getFotografia());
            nombresitiomolde.setText(sitios.getNombre());
            preciositiomolde.setText(sitios.getPrecio());

            //Quiero escuchar click en cada uno de los elementos de la lista

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), SitiosAmpliados.class);
                    intent.putExtra("datossitios",sitios);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
