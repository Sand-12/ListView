package com.example.pizzaandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    private ListView list;

    private Spinner spin;
    String data[]={"A","B","C","D","E","F","G","H","I","J"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        list=(ListView)findViewById(R.id.listview);

        spin=(Spinner)findViewById(R.id.s);

        ArrayAdapter adapter=new ArrayAdapter(Third.this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        spin.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView) view;
                Toast.makeText(Third.this,txt.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView txt=(TextView)view;
                Toast.makeText(Third.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
