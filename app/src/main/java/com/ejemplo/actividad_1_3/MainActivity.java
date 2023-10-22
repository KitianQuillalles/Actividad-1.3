package com.ejemplo.actividad_1_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contactos> items = new ArrayList<>();
        items.add(new Contactos(R.drawable.ic_launcher_foreground, "Juan", "+56977623282", "juan@gmail.com"));
        items.add(new Contactos(R.drawable.ic_launcher_foreground, "Fernando", "+56987652390", "fernando@gmail.com"));
        items.add(new Contactos(R.drawable.ic_launcher_foreground, "Felipe", "+56988542300", "felipe@gmail.com"));

        recyclerView = findViewById(R.id.recycler_contactos);
        recyclerView.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lManager);

        contactAdapter adapter = new contactAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}