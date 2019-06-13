package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewOfAnimals extends AppCompatActivity {
    RecyclerView rvAnimalRecyclerView;
    ArrayList<Animals> animalsList = new ArrayList<>();
    Intent passedIntent;
    int categoryType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_of_animals);
        passedIntent = getIntent();
        categoryType = passedIntent.getIntExtra("category", 0); //

        if(categoryType == 0) {
            populateMammals();
            initializeRecyclerView();
        }
        if(categoryType == 1) {
            populateBirds();
            initializeRecyclerView();
        }
        if(categoryType == 2) {
            populateReptiles();
            initializeRecyclerView();
        }
    }

    private void initializeRecyclerView() {
        rvAnimalRecyclerView = findViewById(R.id.rvAnimalRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        AnimalRecyclerViewAdapter animalRecyclerViewAdapter = new AnimalRecyclerViewAdapter(animalsList);
        animalRecyclerViewAdapter.setInstance(this);
        // this is the adapter
        rvAnimalRecyclerView.setLayoutManager(layoutManager);
        rvAnimalRecyclerView.setAdapter(animalRecyclerViewAdapter);

    }

    private void populateMammals() {
        animalsList.add(new Animals("BEAR", "GROWL and Also Corona"));
        animalsList.add(new Animals("GORILLA", "Beats his Chest"));
        animalsList.add(new Animals("LION", "Roars, King of the Jungle"));
    }

        private void populateBirds() {
            animalsList.add(new Animals("CHICKEN", "Clucks and Chick Fil - A"));
            animalsList.add(new Animals("DOVE", "Quacks and Also Soap"));
            animalsList.add(new Animals("SEAGULL", "Delivers Baby"));
        }

        private void populateReptiles() {
            animalsList.add(new Animals("SNAKES", "HISSES Here and There"));
            animalsList.add(new Animals("CROCODILE", "Peoples wear it"));
            animalsList.add(new Animals("DINOSAURS", "Big With Short arms"));
        }

    }
