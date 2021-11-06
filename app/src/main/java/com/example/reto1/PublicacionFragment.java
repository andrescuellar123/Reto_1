package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PublicacionFragment extends Fragment {

    private RecyclerView recyclerView;

    public PublicacionFragment() {
    }


    public static PublicacionFragment newInstance() {
        PublicacionFragment fragment = new PublicacionFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_publicacion, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        // Inflate the layout for this fragment
        return view;
    }
}