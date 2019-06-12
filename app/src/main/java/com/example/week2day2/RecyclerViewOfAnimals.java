package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewOfAnimals extends AppCompatActivity {
    RecyclerView rvAnimalRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_of_animals);
        initializeRecyclerView();

    }

    private void initializeRecyclerView(){
        rvAnimalRecyclerView =  findViewById(R.id.rvAnimalRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        AnimalRecyclerView animalRecyclerView = new AnimalRecyclerView();// this is the adapter

    }
}
