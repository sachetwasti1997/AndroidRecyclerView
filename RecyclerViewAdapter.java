package com.example.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PlanetViewHolder> {

    private List<Planet> mPlanetList;
    private static final String TAG = "RecyclerViewAdapter";

    public RecyclerViewAdapter(List<Planet> mPlanetList) {
        this.mPlanetList = mPlanetList;
    }

    static class PlanetViewHolder extends RecyclerView.ViewHolder{

        ImageView planetImage;
        TextView planetName;

        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            planetName = itemView.findViewById(R.id.planetName);
            planetImage = itemView.findViewById(R.id.planetImage);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder planetViewHolder, int i) {
        Log.d(TAG, "onBindViewHolder: "+"starts");
        Planet planet = mPlanetList.get(i);
        planetViewHolder.planetImage.setImageResource(planet.getImage());
        planetViewHolder.planetName.setText(planet.getName());

    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Log.d(TAG, "onCreateViewHolder: starts");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.browser, viewGroup, false);

        return new PlanetViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return ((mPlanetList != null) && mPlanetList.size() != 0)?mPlanetList.size():0;
    }

    void loadNewData(List<Planet> planetList){
        Log.d(TAG, "loadNewData: starts");
        mPlanetList = planetList;
        notifyDataSetChanged();
    }

    Planet getPlanet(int position){
        if (mPlanetList!=null && mPlanetList.size() != 0) return mPlanetList.get(position);
        return null;
    }
}
