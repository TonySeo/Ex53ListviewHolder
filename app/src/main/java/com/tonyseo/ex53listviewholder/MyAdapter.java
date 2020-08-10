package com.tonyseo.ex53listviewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {
    ArrayList<String> datas;
    LayoutInflater inflater;

    public MyAdapter(ArrayList<String> datas, LayoutInflater inflater) {
        this.datas = datas;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int i) {
        return datas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = inflater.inflate(R.layout.listview_item, viewGroup, false);
            ViewHolder holder = new ViewHolder(view);
            view.setTag(holder);
        }
        ViewHolder holder = (ViewHolder)view.getTag();
        String s = datas.get(i);

        holder.tv.setText(s);
        return view;
    }

    class ViewHolder{
        TextView tv;
        public ViewHolder(View itemView) {
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
