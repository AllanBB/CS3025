package com.cs3025.ui.tools;


import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.cs3025.R;

import java.util.List;
import java.util.zip.Inflater;

public class IncomingAdapter extends BaseAdapter {
    Context context;
    List<String> titles;
    List<String> descriptions;
    LayoutInflater inflater;

    public IncomingAdapter(Context applicationContext, List<String> titles, List<String> descriptions) {
        this.context = context;
        this.titles=titles;
        this.descriptions=descriptions;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(android.R.layout.two_line_list_item, null);//change layout to R.layout.xml_file for a custom list item
        TextView title = (TextView)view.findViewById(android.R.id.text1);
        TextView desc = (TextView)view.findViewById(android.R.id.text2);
        title.setText(titles.get(i));
        desc.setText(descriptions.get(i));
        return view;
    }
}
