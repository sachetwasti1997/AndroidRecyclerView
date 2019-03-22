package com.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class PlanetList {

    interface OnDataAvailable{
        void onDataAvailable(List<Planet> planets);
    }

    private List<Planet> mPlanetList;
    private OnDataAvailable mCallback;

    public PlanetList(OnDataAvailable mCallback) {
        this.mCallback = mCallback;
        mPlanetList = new ArrayList<>();
        String details, distance_sun;
        details = "Orbit: 57,910,000 km (0.38 AU) from Sun.\n"+"Diameter: 4,880 km.\n"+"Mass: 3.30e23 kg";
        distance_sun = "57.91 million km";
        mPlanetList.add(new Planet("Mercury", R.drawable.mercury, details, distance_sun));
        details = "Orbit: 108,200,000 km (0.72 AU) from Sun.\n"+"Diameter: 12,103.6 km.\n"+"Mass: 4.869e24 kg.";
        distance_sun = "108.2 million km";
        mPlanetList.add(new Planet("Venus", R.drawable.venus, details, distance_sun));
        distance_sun = "149.6 million km";
        details = "Orbit: 149,600,000 km (1.00 AU) from Sun.\n"+"Diameter: 12,756.3 km.\n"+"Mass: 5.972e24 kg.";
        mPlanetList.add(new Planet("Earth", R.drawable.earth, details, distance_sun));
        distance_sun = "227.9 million km";
        details = "Orbit: 227,940,000 km (1.52 AU) from Sun.\n"+"Diameter: 6,794 km.\n"+"Mass: 6.4219e23 kg";
        mPlanetList.add(new Planet("Mars", R.drawable.mars, details, distance_sun));
        distance_sun = "778.5 million km";
        details="Orbit: 778,330,000 km (5.20 AU) from Sun.\n"+"Diameter: 142,984 km (equatorial).\n"+"Mass: 1.900e27 kg";
        mPlanetList.add(new Planet("Jupiter", R.drawable.jupiter, details, distance_sun));
        distance_sun="1.434 billion km";
        details="Orbit: 1,429,400,000 km (9.54 AU) from Sun.\n"+"Diameter: 120,536 km (equatorial).\n"+"Mass: 5.68e26 kg";
        mPlanetList.add(new Planet("Saturn", R.drawable.saturn, details, distance_sun));
        distance_sun="2.871 billion km";
        details="Orbit: 2,870,990,000 km (19.218 AU) from Sun.\n"+"Diameter: 51,118 km (equatorial).\n"+"Mass: 8.683e25 kg";
        mPlanetList.add(new Planet("Uranus", R.drawable.uranus, details, distance_sun));
        distance_sun="4.495 billion km";
        details="Orbit: 4,504,000,000 km (30.06 AU) from Sun.\n"+"Diameter: 49,532 km (equatorial).\n"+"Mass: 1.0247e26 kg";
        mPlanetList.add(new Planet("Neptune", R.drawable.neptune, details, distance_sun));
        mCallback.onDataAvailable(mPlanetList);
    }
}
