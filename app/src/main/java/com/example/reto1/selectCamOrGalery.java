package com.example.reto1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class selectCamOrGalery extends AppCompatActivity {

    private Button btnCamera, btnGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_cam_or_galery);
        btnCamera = findViewById(R.id.btnCamara);
        btnGallery = findViewById(R.id.btnGaleria);

        btnCamera.setOnClickListener(v->{

        });
        btnGallery.setOnClickListener(v->{

        });
    }


}