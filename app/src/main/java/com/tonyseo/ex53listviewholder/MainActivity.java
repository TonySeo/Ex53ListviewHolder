package com.tonyseo.ex53listviewholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    ListView listView;
    ArrayList<String>   datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("ee");
        datas.add("ff");
        datas.add("gg");
        datas.add("hh");

        listView = findViewById(R.id.listview);

        adapter = new MyAdapter(datas, getLayoutInflater());
        listView.setAdapter(adapter);
    }
}
