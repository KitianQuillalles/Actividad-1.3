package com.ejemplo.actividad_1_3;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ViewHolder> {

    private List<Contactos> items;

    public contactAdapter(List<Contactos> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public contactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull contactAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {




        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
