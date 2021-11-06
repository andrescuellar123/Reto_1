package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_perfil_edit extends Fragment {

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil_edit, container, false);
    }
}