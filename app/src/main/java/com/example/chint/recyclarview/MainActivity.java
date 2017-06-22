package com.example.chint.recyclarview;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rviewm;
    private RecyclerView.Adapter adapter;
    private List<ListItems> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rviewm = (RecyclerView)findViewById(R.id.rview);
        rviewm.setHasFixedSize(true);
        rviewm.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        for(int i=0; i<20; i++){
            ListItems li = new ListItems("Heading "+(i+1), "Description ");
            list.add(li);
        }
        adapter = new MyAdapter(list, this);
        rviewm.setAdapter(adapter);
    }
}
