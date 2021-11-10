package com.example.reto1;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.io.File;

public class Fragment_perfil_edit extends Fragment {

    private ImageButton btnCamera;
    private ActivityResultLauncher<Intent> cameraLauncher;
    private File file;

    public Fragment_perfil_edit() {
        // Required empty public constructor
    }

    public static Fragment_perfil_edit newInstance() {
        Fragment_perfil_edit fragment = new Fragment_perfil_edit();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil_edit, container, false);
        btnCamera = view.findViewById(R.id.btnCamera);
        cameraLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), this :: cameraResult);
        // Inflate the layout for this fragment
        return view;
    }


    public void openCamera(View view){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        file = new File(getContext().getExternalFilesDir(null)+ "/perfilphoto.png");
        //File-->Uri
        Uri uri = FileProvider.getUriForFile(getContext(),getContext().getPackageName(), file);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        cameraLauncher.launch(intent);
    }

    public  void cameraResult(ActivityResult result){
        if(result.getResultCode() == RESULT_OK){
            Bitmap bitmap = BitmapFactory.decodeFile(file.getPath());
        }
        //TODO Ver si cuando le doy cancelar va para el fragment

    }
}