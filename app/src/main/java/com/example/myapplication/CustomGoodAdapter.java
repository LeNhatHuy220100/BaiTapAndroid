package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodAdapter extends BaseAdapter {

    Context ctx;
    int layoutitem;
    ArrayList<Good> arrayList;
    public CustomGoodAdapter(Context ctx, int layoutitem, ArrayList<Good> arrayList) {
        this.ctx = ctx;
        this.layoutitem = layoutitem;
        this.arrayList = arrayList;
    }



    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(ctx).inflate(layoutitem, parent, false);

        TextView tvName = convertView.findViewById(R.id.textView);
        TextView tvPrice = convertView.findViewById(R.id.textView2);
        ImageView imgGood = convertView.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imgGood.setImageResource(arrayList.get(position).getImg());

        return convertView;
    }
}
