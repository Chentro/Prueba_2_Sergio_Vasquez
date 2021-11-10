package com.eva.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IMAGENES_SATELITE extends AppCompatActivity {

    double lat, lon;
    ImageButton ibtm1, ibtm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes_satelite);
        ibtm1 = (ImageButton)findViewById(R.id.imageButton);
        ibtm2 = (ImageButton)findViewById(R.id.imageButton);
    }

    public void imagen1(View v){
        Intent I = new Intent(getApplicationContext(), Mostrar.class);
        startActivity(I);

    }

    public void volver(View v){
        Intent I = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(I);
    }

    public void Satelite(View v){

        Bundle B = getIntent().getExtras();
        String Dato=B.getString("Lugar");

        if (Dato.equals("Parral")){
            lat=-36.145340659344726;
            lon=-71.82716488748562;
        }
        else if (Dato.equals("Paine")){
            lat=-33.8035611685878;
            lon=-70.70893001920787;
        }
        else if (Dato.equals("Longavi")){
            lat=-35.96099741156692;
            lon=-71.6788020562325;
        }

        Intent I = new Intent(getApplicationContext(), MapsActivity.class);
        I.putExtra("Lugar", Dato);
        I.putExtra("latitud",lat);
        I.putExtra("longitud", lon);
        startActivity(I);

    }
}