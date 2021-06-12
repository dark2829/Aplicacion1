package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText it1;
    private EditText it2;
    private TextView ot1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, "Creado", Toast.LENGTH_SHORT).show();
        // La actividad ha sido creada.

        it1 = (EditText)findViewById(R.id.itxt_uno);
        it2 = (EditText)findViewById(R.id.itxt_dos);
        ot1 = (TextView) findViewById(R.id.otxt_uno);
    }

    public void  Suma (View view){
        String uno = it1.getText().toString();
        String dos = it2.getText().toString();

        float num1 = Integer.parseInt(uno);
        float num2 = Integer.parseInt(dos);
        float sumaV = num1 + num2;

        String sumaT = String.valueOf(sumaV);
        ot1.setText(sumaT);
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