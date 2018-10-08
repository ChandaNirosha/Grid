package com.example.sys9.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    String[]arr={"sth","sth1","sth2","sth3","sth4","sth5"};
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arr);
        gridView.setAdapter(adapter);
    }
}
