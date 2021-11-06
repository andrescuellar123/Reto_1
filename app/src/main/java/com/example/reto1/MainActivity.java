package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //FRAGMENTS
    private PerfilFragment perfilFragment; // perfil solito
    private PostWithoutFragment postWithoutFragment; //primer post
    private MapsFragment mapsFragment; //
    private Fragment_perfil_edit perfilEdit; // editar perfil
    private PublicacionFragment publicacionFragment; // lista de publicaciones

    //elements UI
    private BottomNavigationView bttNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bttNavigation = findViewById(R.id.menuNavigation);
        functionMenu();
        perfilFragment = PerfilFragment.newInstance();
        postWithoutFragment = PostWithoutFragment.newInstance();
        mapsFragment = MapsFragment.newInstance();



        showFragment(perfilFragment);
    }

    public void functionMenu(){
        bttNavigation.setOnItemSelectedListener(menuItem -> {
            if(menuItem.getItemId() == R.id.perfilItem){
                showFragment(perfilFragment);
            }
            else if(menuItem.getItemId() == R.id.postItem){
                showFragment(postWithoutFragment);
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