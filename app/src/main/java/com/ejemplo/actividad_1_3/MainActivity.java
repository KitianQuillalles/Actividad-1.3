package com.ejemplo.actividad_1_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_contacts);

        List<MyItem> items = new ArrayList<>();
        items.add(new MyItem("Item 1", "Description 1"));
        items.add(new MyItem("Item 2", "Description 2"));
        items.add(new MyItem("Item 3", "Description 3"));

        contactAdapter adapter = new contactAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}