package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link selectCamOrGaleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class selectCamOrGaleryFragment extends Fragment {



    public selectCamOrGaleryFragment() {
        // Required empty public constructor
    }


    public static selectCamOrGaleryFragment newInstance(String param1, String param2) {
        selectCamOrGaleryFragment fragment = new selectCamOrGaleryFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_cam_or_galery, container, false);
    }
}