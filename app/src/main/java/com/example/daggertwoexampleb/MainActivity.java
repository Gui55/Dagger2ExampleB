package com.example.daggertwoexampleb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Corpo corpo = criarCorpo();

        TextView bloodText = findViewById(R.id.sangueTv);

        bloodText.setText("Tipo de sangue: "+corpo.getSangue().getTipoDeSangue());

    }

    private Corpo criarCorpo(){

        Doutor doutor = DaggerDoutor.create();
        return doutor.injetarSangue();

    }
}
