package com.example.occ_camera2api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static String LOADTAG = "Open_LOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnContinuar = findViewById(R.id.txtContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí se ejecutará cuando se presione el botón Continuar
                // Puedes iniciar otra actividad o hacer lo que necesites

                // Ejemplo: Iniciar una nueva actividad llamada SecondActivity
                Intent intent = new Intent(MainActivity.this, CameraConfig.class);
                startActivity(intent);
            }
        });
    }
}