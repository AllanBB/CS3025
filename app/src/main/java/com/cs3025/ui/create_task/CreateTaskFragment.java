package com.cs3025.ui.create_task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.cs3025.R;

public class CreateTaskFragment extends Fragment {

    private CreateTaskViewModel createTaskViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        createTaskViewModel = ViewModelProviders.of(this).get(CreateTaskViewModel.class);
        View root = inflater.inflate(R.layout.fragment_create_task, container, false);
        //final TextView textView = root.findViewById(R.id.text_slideshow);
        createTaskViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        //LinearLayout userPicList = root.findViewById(R.id.user_list);
        //LayoutInflater inflater = LayoutInflater.from(getContext());

        for (int i=0;i<6;i++) {
            //View view = inflater.inflate(R.layout.user_picture, userPicList, false);
            //TextView textView = view.findViewById(R.id.user_list_text);
            //textView.setText("User: "+ i);
            //ImageView imageView = view.findViewById(R.id.user_image_view);
            //imageView.setImageResource(R.mipmap.ic_launcher);
            //userPicList.addView(view);
        }

        return root;
    }
}