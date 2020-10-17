package com.example.lista_personalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearAuto extends AppCompatActivity {
    private EditText placa, precio;
    private Spinner marca, modelo, color;
    private String[] opcionesMarca, opcionesModelo, opcionesColor;
    private int fotos[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_auto);
        placa = findViewById(R.id.txtPlaca);
        precio = findViewById(R.id.txtPrecio);

        fotos = new int[3];
        fotos[0] = R.drawable.carro1;
        fotos[1] = R.drawable.carro2;
        fotos[2] = R.drawable.carro3;
        fotos[3] = R.drawable.carro4;

        marca = (Spinner) findViewById(R.id.cmbMarca);
        opcionesMarca = getResources().getStringArray(R.array.marcas);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, opcionesMarca);
        marca.setAdapter(adapter);

        modelo = (Spinner) findViewById(R.id.cmbModelo);
        opcionesModelo = getResources().getStringArray(R.array.modelos);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, opcionesModelo);
        modelo.setAdapter(adapter2);

        color = (Spinner) findViewById(R.id.cmbColor);
        opcionesColor = getResources().getStringArray(R.array.colores);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, opcionesColor);
        color.setAdapter(adapter3);
    }
    public void guardar(View v){
        String plac, marc, model, col;
        String prec;
        Automovil p;
        plac = placa.getText().toString();
        prec = precio.getText().toString();
        marc = marca.getAdapter().toString();
        model = modelo.getAdapter().toString();
        col = color.getAdapter().toString();

        Toast.makeText(this, getString(R.string.mensaje_guardado),Toast.LENGTH_LONG).show();
    }

}