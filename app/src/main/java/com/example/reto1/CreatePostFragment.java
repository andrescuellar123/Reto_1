package com.example.reto1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import model.Post;


public class CreatePostFragment extends Fragment implements View.OnClickListener {

    private EditText nombreDelEvento;
    private TextView ubicacion;
    private Button crearEventoBtn, inicio, fin;
    private ImageButton ubicacionBtn;


    public CreatePostFragment() {
        // Required empty public constructor
    }


    public static CreatePostFragment newInstance(String param1, String param2) {
        CreatePostFragment fragment = new CreatePostFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_create_post, container, false);
        nombreDelEvento = view.findViewById(R.id.nameEvent);
        ubicacion = view.findViewById(R.id.ubicacion);
        inicio = view.findViewById(R.id.inicioBtn);
        fin = view.findViewById(R.id.finBtn);
        ubicacionBtn = view.findViewById(R.id.ubicacionBtn);
        crearEventoBtn = view.findViewById(R.id.crearBtn);


        crearEventoBtn.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.crearEventoBtn:
                Post post = new Post(nombreDelEvento.getText().toString(), inicio.getText().toString(),fin.getText().toString(), ubicacion.getText().toString() );

        }
    }
}