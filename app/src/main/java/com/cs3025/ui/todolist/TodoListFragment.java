package com.cs3025.ui.todolist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.cs3025.R;
import java.util.List;

import java.util.ArrayList;

public class TodoListFragment extends Fragment {

    private TodoListViewModel todoListViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        todoListViewModel = ViewModelProviders.of(this).get(TodoListViewModel.class);

        View root = inflater.inflate(R.layout.fragment_todolist, container, false);
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
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckedTextView check = (CheckedTextView)view;
                check.setChecked(!check.isChecked());

            }
        });
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