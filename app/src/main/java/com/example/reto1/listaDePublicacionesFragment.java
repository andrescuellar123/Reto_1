package com.example.reto1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link listaDePublicacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class listaDePublicacionesFragment extends Fragment implements  NewItemFragment.OnNewItemListener{

    //State
    private PostAdapter adapter;


    public listaDePublicacionesFragment() {
        // Required empty public constructor
        adapter = new PostAdapter();
    }


    public static listaDePublicacionesFragment newInstance(String param1, String param2) {
        listaDePublicacionesFragment fragment = new listaDePublicacionesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        //COSAS CON EL BIDING
        //biding= FragmentListItemBiding.Inflate(inflater,container,false);
        //View view = biding.getRoot();

        RecyclerView taskRecycler = binding.taskRecycler;
        taskRecycler.setHasFixedSize(true);
        taskRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        taskRecycler.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_lista_de_publicaciones, container, false);
    }
    @Override
    public  void OnNewItem(String Item){
        log.e(">>>","New Item: "+item);
         adapter.addTask(item);

    }

}