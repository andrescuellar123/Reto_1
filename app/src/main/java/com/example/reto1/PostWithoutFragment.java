package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PostWithoutFragment extends Fragment {


    public PostWithoutFragment() {
        // Required empty public constructor
    }


    public static PostWithoutFragment newInstance() {
        PostWithoutFragment fragment = new PostWithoutFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_withoutpost, container, false);
    }
}