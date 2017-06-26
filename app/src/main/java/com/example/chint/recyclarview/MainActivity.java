package com.example.chint.recyclarview;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] p = {R.drawable.carrick, R.drawable.costa, R.drawable.costa, R.drawable.carrick, R.drawable.costa,
                R.drawable.degea, R.drawable.oscar, R.drawable.herera, R.drawable.herera, R.drawable.carrick};
        String[] a = {"Title1", "Title2", "Title3", "Title4", "Title5", "Title6", "Title7", "Title8", "Title9", "Title10"};
        String[] b = {"Description1", "Desciption2", "Desciption3", "Desciption4", "Desciption5", "Desciption6",
                "Desciption7", "Desciption8", "Desciption9", "Desciption10"};

        RecyclerView rviewm = (RecyclerView)findViewById(R.id.rview);
        // rviewm.setHasFixedSize(true);
        rviewm.setLayoutManager(new LinearLayoutManager(this));
        // rviewm.setItemAnimator(new DefaultItemAnimator());

        MyAdapter adapter = new MyAdapter(this, a, b, p);
        rviewm.setAdapter(adapter);
    }
}
