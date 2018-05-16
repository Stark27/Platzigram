package com.example.luismunoz.platzigram.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luismunoz.platzigram.R;
import com.example.luismunoz.platzigram.adapters.PictureAdapterRecyclerView;
import com.example.luismunoz.platzigram.models.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    private int numOfColumns = 2;


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView pictureRecycler = (RecyclerView) view.findViewById(R.id.rv_FragmentSearch_pictureRecycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), numOfColumns);
        pictureRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        pictureRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.ik-art.com/img/s7/v167/p533115828-11.jpg", "Luis Muñoz", "4 dias", "10 Me gusta"));
        pictures.add(new Picture("http://thumbs.imagekind.com/4356006_200/Cliffs-of-Moher.jpg", "Carolina Muñoz", "2 dias", "20 Me gusta"));
        pictures.add(new Picture("http://www.ianmold.com/images/outback/victoria-river-200x.jpg", "Teresa Garrido", "3 dias", "15 Me gusta"));
        pictures.add(new Picture("http://www.ik-art.com/img/s7/v167/p533115828-11.jpg", "Luis Muñoz", "4 dias", "10 Me gusta"));
        return pictures;
    }

}
