package com.softuni.recviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.softuni.recviewdemo.adapter.AccessoriesAdapter;
import com.softuni.recviewdemo.data.BaseModel;
import com.softuni.recviewdemo.data.gag;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<BaseModel> data = gag.getDatabase();
        AccessoriesAdapter adapter = new AccessoriesAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}