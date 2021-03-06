package com.cs3025.ui.pending_task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.cs3025.R;

import java.util.ArrayList;
import java.util.List;

public class PendingTaskFragment extends Fragment {

    private PendingTaskModel pendingTaskModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        pendingTaskModel = ViewModelProviders.of(this).get(PendingTaskModel.class);
        View root = inflater.inflate(R.layout.fragment_pending_task, container, false);
        ListView listView;
        List list = new ArrayList();
        ArrayAdapter adapter;
        listView = root.findViewById(R.id.pending_listview);
        list.add("Waiting for Allan to accept the task sent on\n27/02/2020");
        list.add("Waiting for Tim to accept the task sent on\n27/01/2020");
        list.add("Waiting for John to accept the task sent on\n23/02/2020");
        list.add("Waiting for John to accept the task sent on\n21/02/2020");

        //adapter  = new ArrayAdapter(list);
        adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, list );
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