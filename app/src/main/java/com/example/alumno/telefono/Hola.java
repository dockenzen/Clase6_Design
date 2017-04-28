package com.example.alumno.telefono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Hola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hola);
        setContentView(R.layout.activity_layout);
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Carlos","Diaz"));





        RecyclerView list = (RecyclerView)findViewById(R.id.list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        list.setLayoutManager(layoutManager);

        MyAdaptador adapter = new MyAdaptador(personas);

        list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu2,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("Click", "Opcion del menu "+ item.getTitle() );
        return super.onOptionsItemSelected(item);
    }
}
