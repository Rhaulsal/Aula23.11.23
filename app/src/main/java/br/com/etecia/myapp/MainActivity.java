package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView idRecycleViewFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecycleViewFilmes = findViewById(R.id.idRecycleViewFilmes);

        idRecycleViewFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecycleViewFilmes.setHasFixedSize(true);

        //idRecycleViewFilmes.setAdapter(adapter);


    }
}