package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PerfilFragment extends Fragment {
    private ImageView imageBusinnes;
    private TextView nameBusiness, descriptionBusiness, noImage;
    private ImageButton editBusiness;

    public PerfilFragment() {
        // Required empty public constructor
    }


    public static PerfilFragment newInstance() {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);
        imageBusinnes = view.findViewById(R.id.imageBusiness);
        editBusiness = view.findViewById(R.id.editBusiness);
        nameBusiness = view.findViewById(R.id.nameBusiness);
        descriptionBusiness = view.findViewById(R.id.descripBusiness);
        noImage = view.findViewById(R.id.noImage);
        return view;
    }
}