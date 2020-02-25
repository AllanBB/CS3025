package com.cs3025.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cs3025.MainActivity;
import com.cs3025.R;
import java.util.List;
import android.widget.ListView;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel.class);

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        ListView listView;
        List list = new ArrayList();
        ArrayAdapter adapter;
        listView = root.findViewById(R.id.list_view);
        list.add("Pay Rent");
        list.add("Sweep Floors");
        list.add("Water Plants");
        //adapter  = new ArrayAdapter(list);
        adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_checked, list );
        listView.setAdapter(adapter);
        for(int i=0;i< list.size(); i++ ) {
            listView.setItemChecked(i, false );
        }
        /*
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        return root;
    }



}