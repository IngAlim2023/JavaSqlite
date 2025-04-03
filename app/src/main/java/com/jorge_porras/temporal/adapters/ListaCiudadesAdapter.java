package com.jorge_porras.temporal.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jorge_porras.temporal.R;
import com.jorge_porras.temporal.models.Ciudades;

import java.util.ArrayList;

public class ListaCiudadesAdapter extends RecyclerView.Adapter<ListaCiudadesAdapter.CiudadViewHolder> {

    ArrayList<Ciudades> listaCiudades;

    public ListaCiudadesAdapter(ArrayList<Ciudades> listaCiudades){
        this.listaCiudades = listaCiudades;
    }

    @NonNull
    @Override
    public CiudadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_ciudad, null, false);
        return new CiudadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CiudadViewHolder holder, int position) {
        holder.viewCod.setText(String.valueOf(listaCiudades.get(position).getCod()));
        holder.viewNombre.setText(String.valueOf(listaCiudades.get(position).getNombre()));
    }

    @Override
    public int getItemCount() {
        return listaCiudades.size();
    }

    public class CiudadViewHolder extends RecyclerView.ViewHolder {
        TextView viewCod, viewNombre;
        public CiudadViewHolder(@NonNull View itemView) {
            super(itemView);
            viewCod = itemView.findViewById(R.id.viewIdCiudad);
            viewNombre = itemView.findViewById((R.id.viewNombreCiudad));
        }
    }

}
