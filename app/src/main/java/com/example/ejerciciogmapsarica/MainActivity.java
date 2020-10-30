package com.example.ejerciciogmapsarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView latitud, longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latitud = (TextView) findViewById(R.id.latitud);
        longitud = (TextView) findViewById(R.id.longitud);
    }

    public void buscarEnMapa(View view){
        Intent intento = new Intent(getApplicationContext(), MapsActivity.class);

        intento.putExtra("latitud", latitud.getText().toString());
        intento.putExtra("longitud", longitud.getText().toString());

        startActivity(intento);

    }
}