package com.example.admin.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.orderfood.R;

import java.util.List;

/**
 * Created by Admin on 9/12/2017.
 */

public class TableAdapter extends BaseAdapter {

    private Activity activity;
    private int resource;
    private List<Integer> list;

    public TableAdapter(Activity activity, int resource, List<Integer> list){
        this.activity = activity;
        this.resource = resource;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    class TableViewHolder{
        public TextView txt_id_table;
        public ImageView img_table;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TableViewHolder holder;

        if(view == null){
            holder = new TableViewHolder();
            view = this.activity.getLayoutInflater().inflate(this.resource, null);
            holder.txt_id_table = view.findViewById(R.id.txt_id_table);
            holder.img_table = view.findViewById(R.id.img_table);

            view.setTag(holder);
        }else{
            holder = (TableViewHolder) view.getTag();
        }



        return view;
    }
}
