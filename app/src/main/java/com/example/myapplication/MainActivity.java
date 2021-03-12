package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodAdapter adt;
    ArrayList<Good> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.lvGoods);
        arrayList = new ArrayList<>();
        arrayList.add(
                new Good("Google", "$80", R.drawable.google)
        );
        arrayList.add(
                new Good("Google", "$80", R.drawable.google)
        );

        adt = new CustomGoodAdapter(this, R.layout.item_listview, arrayList);
        lvGoods.setAdapter(adt);

    }
}