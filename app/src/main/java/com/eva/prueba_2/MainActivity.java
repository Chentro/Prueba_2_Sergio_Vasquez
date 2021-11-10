package com.eva.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public Spinner spi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spi = (Spinner)findViewById(R.id.spinner);

        String [] opciones = {"Parral", "Paine", "longavi"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.spiner_item, opciones);
        spi.setAdapter(adapter);
    }

    public void continuar(View v){

        String selec = spi.getSelectedItem().toString();

        Intent I = new Intent(getApplicationContext(), IMAGENES_SATELITE.class);
        I.putExtra("Lugar", selec);
        startActivity(I);
    }
}