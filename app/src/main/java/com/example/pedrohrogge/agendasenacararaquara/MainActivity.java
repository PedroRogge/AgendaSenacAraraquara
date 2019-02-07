package com.example.pedrohrogge.agendasenacararaquara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.listaContatos);

        String[] Contatos = {"Pedro","Alysson","Du","Guilherme"};

        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Contatos ) ;
        lista.setAdapter(adapter);
    }
}
