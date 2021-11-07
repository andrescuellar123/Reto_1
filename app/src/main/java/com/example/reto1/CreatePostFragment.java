package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;


public class CreatePostFragment extends Fragment implements View.OnClickListener {

    private EditText nombreDelEventoTxt;
    private EditText ubicacionTxt;
    private EditText hInicioTxt;
    private EditText hFinTxt;
    private Button ubicacionBtn;
    private Button crearEventoBtn;


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

        View view = inflater.inflate(R.layout.fragment_publicacion, container, false);
        nombreDelEventoTxt = view.findViewById(R.id.nombreDelEventoTxt);
        ubicacionTxt = view.findViewById(R.id.ubicacionTxt);
        hInicioTxt = view.findViewById(R.id.hInicioTxt);
        hFinTxt = view.findViewById(R.id.hFinTxt);
        ubicacionBtn = view.findViewById(R.id.ubicacionBtn);
        crearEventoBtn = view.findViewById(R.id.crearEventoBtn);


        crearEventoBtn.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.crearEventoBtn:
                Post post = new Post(nombreDelEventoTxt.getText().toString(), ubicacionTxt.getText().toString(),hInicioTxt.getText().toString(),hFinTxt.getText().toString());
                Gson gson = new Gson();
                String json = gson.toJson(post);

                HTTPSWebUtilDomi https = new HTTPSWebUtilDomi();
                new Thread(
                        ()->{
                            String response = https.PUTrequest(Constants.BASE_URL+"posts/"+post.getNombreEvento()+".json",json);
                        }
                ).start();

                break;
        }
    }
}