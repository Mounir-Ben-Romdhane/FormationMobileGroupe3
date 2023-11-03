package com.example.formationgroupe3oct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valeur1,valeur2;
    private Button btnSomme;
    private TextView result;

    private String v1S,v2S;
    private int v1I,v2I,sommeI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valeur1 = findViewById(R.id.valeur1);
        valeur2 = findViewById(R.id.valeur2);
        btnSomme = findViewById(R.id.btnSomme);
        result = findViewById(R.id.result);

        btnSomme.setOnClickListener(v ->{
            v1S = valeur1.getText().toString();
            v2S = valeur2.getText().toString();
            v1I = Integer.parseInt(v1S);
            v2I = Integer.parseInt(v2S);
            sommeI = v1I + v2I;
            result.setText("Result "+btnSomme.getText().toString()+" : "+sommeI);
        });

    }
}