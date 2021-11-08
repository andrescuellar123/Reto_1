package com.example.reto1;

import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.reto1.databinding.ActivityEscogerUbicacionBinding;

public class EscogerUbicacionActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapLongClickListener {

    private GoogleMap mMap;
    private ActivityEscogerUbicacionBinding binding;
    private LocationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityEscogerUbicacionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        manager = (LocationManager) getSystemService(LOCATION_SERVICE);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation(), 10));
        mMap.setOnMapLongClickListener(this);
    }


    @SuppressLint("MissingPermission")
    public LatLng myLocation(){
        LatLng toReturn;
        Location location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        if(location != null){
            toReturn = new LatLng(location.getLatitude(), location.getLongitude());
        }
        else{
            toReturn = new LatLng(3,-74);
        }
        return toReturn;
    }


    @Override
    public void onMapLongClick(LatLng latLng) {
        mMap.addMarker(new MarkerOptions().position(latLng).title(""));
    }

    public void
}