package com.cs3025.ui.tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.cs3025.R;

import java.util.ArrayList;
import java.util.List;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        toolsViewModel = ViewModelProviders.of(this).get(ToolsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_todolist, container, false);
        ListView listView;
        List titles = new ArrayList();
        List descs = new ArrayList();
        IncomingAdapter adapter;
        listView = root.findViewById(R.id.list_view);
        titles.add("Work");
        titles.add("More Work");
        descs.add("do it");
        descs.add("do it more");
        //adapter  = new ArrayAdapter(list);
        adapter = new IncomingAdapter(getContext(), titles,descs);
        listView.setAdapter(adapter);
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