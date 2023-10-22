package com.ejemplo.actividad_1_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_contactos);


        List<Contactos> items = new ArrayList<>();
        items.add(new Contactos(1, "Juan", "+56977623282", "juan@gmail.com"));
        items.add(new Contactos(2, "Fernando", "+56987652390", "fernando@gmail.com"));
        items.add(new Contactos(3, "Felipe", "+56988542300", "felipe@gmail.com"));

        contactAdapter adapter = new contactAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}