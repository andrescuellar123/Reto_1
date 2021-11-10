package com.example.reto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import model.Profile;

public class MainActivity extends AppCompatActivity {
//TODO hacer todo lo de firebase aqui
    //FRAGMENTS
    private PerfilFragment perfilFragment; // perfil solito
    private MapsFragment mapsFragment; //
    private Fragment_perfil_edit perfilEdit; // editar perfil
    private PostWithoutFragment postWithoutFragment; //frragmento sin publicaciones
    private PublicacionFragment publicacionFragment; // lista de publicaciones
    private CreatePostFragment createPostFragment; //agregar un post

    private Profile profile;

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

        //PERMISOS
        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA,
                Manifest.permission.MANAGE_EXTERNAL_STORAGE}, 1);



        showFragment(perfilFragment);
    }

    public void functionMenu(){
        bttNavigation.setOnItemSelectedListener(menuItem -> {
            if(menuItem.getItemId() == R.id.perfilItem){
                if(noProfile() == false){//ya hay un perfil

                }
                else{// si no hay perfil
                    showFragment(perfilFragment);
                }
            }
            else if(menuItem.getItemId() == R.id.postItem){
                if(){// hay post

                }
                else{//no hay post
                    showFragment(postWithoutFragment);
                }
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

    public void addProfile(Profile profile){
        FirebaseFirestore.getInstance().collection("profile").document(profile.getBusinessName()).set(profile);
    }

    public Profile getProfile(){
        Query query = FirebaseFirestore.getInstance().collectionGroup("profile");
        query.get().addOnCompleteListener(
                task->{
                    for(DocumentSnapshot documentSnapshot : task.getResult()){
                        profile = documentSnapshot.toObject(Profile.class);
                    }
                }
        )
    }

    public boolean noProfile(){
        final boolean[] toReturn = {false};
        Query query = FirebaseFirestore.getInstance().collectionGroup("profile");
        query.get().addOnCompleteListener(
                task->{
                    toReturn[0] = task.getResult().isEmpty();
                }
        );
        return toReturn[0];
    }
}