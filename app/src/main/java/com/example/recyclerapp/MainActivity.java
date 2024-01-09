package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llenado del combobox
        //paso 1 data
        final String[] Categorias =
                new String[]{"Categorías", "Hoteles", "Restaurantes", "Lugares Turísticos"};
        //paso 2 adaptador
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, Categorias);
        //paso 3 enlazar adaptador con combobox
        Spinner cbCategoria = (Spinner) findViewById(R.id.cbCategoria);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cbCategoria.setAdapter(adaptador);
        cbCategoria.setOnItemSelectedListener(this);




        final String[] subCategorias =
                new String[]{"Sub Categorías", "Hoteles", "Restaurantes", "Lugares Turísticos"};
        //paso 2 adaptador
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, subCategorias);
        //paso 3 enlazar adaptador con combobox
        Spinner cbsubCategoria = (Spinner) findViewById(R.id.cbsubCategoria);
        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cbsubCategoria.setAdapter(adapter);
        cbsubCategoria.setOnItemSelectedListener(this);


        //llenado del listview
        //paso 1 data
        final String[] Categorias2 =
                new String[]{"CATEGORÍAS", "Hoteles", "Restaurantes", "Lugares Turísticos"};
        //paso 2 adaptador
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, Categorias2);
        //paso 3 enlazar adaptador con combobox
        ListView lvLugar = (ListView) findViewById(R.id.lvLugar);
        lvLugar.setAdapter(adaptador2);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //necesito agregar un comparador en el view para que al momento de seleccionar
        //un item del combobox se muestre en el textview y no se repita
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(parent.getItemAtPosition(position).toString());

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(parent.getItemAtPosition(position).toString());

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}