package com.geektech.homework33names;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private NameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> names = new ArrayList<>();
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");
        names.add("Madina");

        adapter = new NameAdapter(names);
    }
}