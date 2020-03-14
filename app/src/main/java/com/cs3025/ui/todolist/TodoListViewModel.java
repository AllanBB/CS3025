package com.cs3025.ui.todolist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TodoListViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TodoListViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This will be a list");
    }

    public LiveData<String> getText() {
        return mText;
    }
}