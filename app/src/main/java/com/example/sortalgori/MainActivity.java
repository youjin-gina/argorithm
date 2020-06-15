package com.example.sortalgori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> argorithmDataList = new ArrayList<>();
        argorithmDataList.add("Sort");

        RecyclerView argorithmList = findViewById(R.id.rv_algorithm);
        argorithmList.setLayoutManager(new LinearLayoutManager(this));
        argorithmList.setAdapter(new ArgorithmAdapter(this, argorithmDataList));
        argorithmList.setClick
    }
}
