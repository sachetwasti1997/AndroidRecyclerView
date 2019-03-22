package com.example.adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        Intent intent = getIntent();
        Planet planet = (Planet) intent.getSerializableExtra("details");

        if (planet != null){
            TextView planet_title_detail = findViewById(R.id.planet_title_detail);
            planet_title_detail.setText(planet.getName());

            ImageView planet_image_detail = findViewById(R.id.planet_image_detail);
            if (planet.getName().equals("Mercury")){
                planet_image_detail.setImageResource(R.drawable.mercury);
            }else if (planet.getName().equals("Venus")){
                planet_image_detail.setImageResource(R.drawable.venus);
            }else if (planet.getName().equals("Earth")){
                planet_image_detail.setImageResource(R.drawable.earth);
            }else if (planet.getName().equals("Mars")){
                planet_image_detail.setImageResource(R.drawable.mars);
            }else if (planet.getName().equals("Jupiter")){
                planet_image_detail.setImageResource(R.drawable.jupiter);
            }else if (planet.getName().equals("Saturn")){
                planet_image_detail.setImageResource(R.drawable.saturn);
            }else if (planet.getName().equals("Uranus")){
                planet_image_detail.setImageResource(R.drawable.uranus);
            }else if (planet.getName().equals("Neptune")){
                planet_image_detail.setImageResource(R.drawable.neptune);
            }

            TextView planet_detail_detail = findViewById(R.id.planet_detail_detail);
            planet_detail_detail.setText(planet.getDetails());

            TextView planet_distance_sun = findViewById(R.id.planet_distance_sun);
            planet_distance_sun.setText(planet.getDistance_sun());
        }
    }
}
