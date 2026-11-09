package com.app.cliques;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    TextView txtContador;
    Button btnAdicionar, btnDiminuir, btnZerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContador = findViewById(R.id.txtContador);

        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnDiminuir = findViewById(R.id.btnDiminuir);
        btnZerar = findViewById(R.id.btnZerar);

        btnAdicionar.setOnClickListener(v -> {
            contador++;
            atualizarContador();
        });

        btnDiminuir.setOnClickListener(v -> {
            if (contador > 0) {
                contador--;
                atualizarContador();
            }
        });

        btnZerar.setOnClickListener(v -> {
            contador = 0;
            atualizarContador();
        });
    }

    private void atualizarContador() {
        txtContador.setText(String.valueOf(contador));
    }
}
