package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private PerfilFragment perfilFragment;
    private PublicacionFragment publicacionFragment;
    private MapsFragment mapsFragment;

    private BottomNavigationView bttNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttNavigation = findViewById(R.id.menuNavigation);
        functionMenu();
        perfilFragment = PerfilFragment.newInstance();
        publicacionFragment = PublicacionFragment.newInstance();
        mapsFragment = MapsFragment.newInstance();



        showFragment(perfilFragment);
    }

    public void functionMenu(){
        bttNavigation.setOnItemSelectedListener(menuItem -> {
            if(menuItem.getItemId() == R.id.perfilItem){
                showFragment(perfilFragment);
            }
            else if(menuItem.getItemId() == R.id.postItem){
                showFragment(publicacionFragment);
            }
            else if(menuItem.getItemId() == R.id.mapsItem){
                showFragment(mapsFragment);
            }
            return true;
        });
    }

    public void showFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContain, fragment);
        fragmentTransaction.commit();
    }
}