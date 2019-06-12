package com.example.week2day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.AdapterView.*;

public class CategoryListView extends AppCompatActivity {
    ArrayList<String> animalCategories = new ArrayList<>();
    ListView lvMyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_view);
        populateCategory();
        lvMyListView = findViewById(R.id.lvMyListView);
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animalCategories);
        lvMyListView.setAdapter(adapter);
        lvMyListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), RecyclerViewOfAnimals.class);
                startActivity(intent);

            }
        });
    }




    public ListView getLvMyListView() {
        return lvMyListView;
    }

    private void populateCategory(){
        animalCategories.add("Mammal");
        animalCategories.add("Bird");
        animalCategories.add("Reptile");
        animalCategories.add("Fish");
        animalCategories.add("Amphibian");
        animalCategories.add("Bug");
        animalCategories.add("Invertebrate");

    }


}
