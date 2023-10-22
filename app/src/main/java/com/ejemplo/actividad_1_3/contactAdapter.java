package com.ejemplo.actividad_1_3;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ViewHolder> {

    private List<Contactos> items;

    public contactAdapter(List<Contactos> items) {
        this.items = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imagen;
        public TextView nombre;
        public TextView numero;
        public TextView correo;

        public ViewHolder(@NonNull View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            numero = (TextView) v.findViewById(R.id.numero);
            correo = (TextView) v.findViewById(R.id.correo);
        }
    }
    @NonNull
    @Override
    public contactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull contactAdapter.ViewHolder viewHolder, int position) {
        viewHolder.imagen.setImageResource(items.get(position).getImagen());
        viewHolder.nombre.setText("Nombre:" + items.get(position).getNombre());
        viewHolder.numero.setText("Numero:" + items.get(position).getNumero());
        viewHolder.correo.setText("Correo:" + items.get(position).getCorreo());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
