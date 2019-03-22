package com.example.adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PlanetList.OnDataAvailable, RecyclerItemClickListener.OnRecyclerClickListener {

    private RecyclerViewAdapter mRecycle;
    private List<Planet> mPlanetList;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.planet_list);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecycle = new RecyclerViewAdapter(new ArrayList<Planet>());
        recyclerView.setAdapter(mRecycle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        PlanetList planetList = new PlanetList(this);
    }

    @Override
    public void onDataAvailable(List<Planet> planets) {
        Log.d(TAG, "onDataAvailable: "+planets);
        mPlanetList = planets;
        mRecycle.loadNewData(planets);
    }

    @Override
    public void onItemLongClick(View view, int position) {
        Intent intent = new Intent(this, PlanetDetailActivity.class);
        intent.putExtra("details", mRecycle.getPlanet(position));
        startActivity(intent);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Normal tap at "+mPlanetList.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
