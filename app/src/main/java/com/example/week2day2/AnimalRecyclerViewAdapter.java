package com.example.week2day2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalRecyclerViewAdapter extends RecyclerView.Adapter<AnimalRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Animals> animalInfo;
    private RecyclerViewOfAnimals instance;


    public AnimalRecyclerViewAdapter(ArrayList<Animals> animalInfo) { // This is the adapter
        this.animalInfo = animalInfo;

    }

    public void setInstance(RecyclerViewOfAnimals instance) {
        this.instance = instance;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_animal, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Animals itemAnimal = animalInfo.get(position);
        holder.tvAnimal.setText(itemAnimal.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myDescription = itemAnimal.getDescription();
                Intent intent = new Intent(instance, ItemDescriptionActivity.class);
                intent.putExtra("animal_passed", myDescription);
                instance.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() { //gets the size of the array
        return animalInfo.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAnimal;
        TextView tvDescription;//instantiates the text view


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAnimal = itemView.findViewById(R.id.tvAnimal); // Binds the tv view on list_animal xml
            tvDescription = itemView.findViewById(R.id.tvDescriptionDisplay);
        }
    }
}
