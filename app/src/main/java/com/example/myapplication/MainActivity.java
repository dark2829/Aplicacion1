package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mate = 5 , esp = 5 , ing = 5;
        float prom = 0;

        prom = (mate + esp + ing ) / 3;

        if (prom >= 6 ){
            Toast.makeText(this, "Aprobado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Reprobado", Toast.LENGTH_SHORT).show();
        }

        //Toast.makeText(this, "Creado", Toast.LENGTH_SHORT).show();
        // La actividad ha sido creada.
    }

    @Override
    protected void onStart() {
        super.onStart();
        ///Toast.makeText(this, "Iniciado", Toast.LENGTH_SHORT).show();
        //La actividad esta a punto de hacerse visible
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "En ejecución", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "En pausa", Toast.LENGTH_SHORT).show();
        // La actividad está en pausa (está a punto de ser detenida).
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "Detenida", Toast.LENGTH_SHORT).show();
        // La actividad está en pausa, está a punto de cerrarse.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Cerrada", Toast.LENGTH_SHORT).show();
        // La actividad se ha cerrado
    }
}