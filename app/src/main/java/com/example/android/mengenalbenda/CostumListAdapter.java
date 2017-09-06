package com.example.android.mengenalbenda;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 6/3/17.
 */

public class CostumListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] tambahan;
    private final Integer[] imgid;

    public CostumListAdapter(Activity context, String[] itemname, Integer[] imgid, String[] tambahan){
        super(context,R.layout.activity_namabenda,itemname);

        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
        this.tambahan = tambahan;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_namabenda,null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.gbr);
        TextView imageText = (TextView) rowView.findViewById(R.id.namabunga);
        TextView extratext = (TextView) rowView.findViewById(R.id.des);

        imageText.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratext.setText(tambahan[position]);
        return rowView;
    }
}
