package com.example.admin.Adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.DTO.Dish;
import com.example.admin.orderfood.R;

import java.util.List;

/**
 * Created by Admin on 9/20/2017.
 */

public class DishAdapter extends BaseAdapter {

    private Activity activity;
    private int resource;
    private List<Dish> list;

    public DishAdapter(Activity activity, int resource, List<Dish> list){
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

    public Bitmap stringToBitmap(String imageOfDish){
        byte[]encodeByte = Base64.decode(imageOfDish, Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
        return bitmap;
    }


    class DishViewHolder{
        public TextView txt_name_of_dish;
        public ImageView img_image;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DishViewHolder holder = null;

        if(view == null){
            holder = new DishViewHolder();
            view = this.activity.getLayoutInflater().inflate(this.resource, null);
            holder.txt_name_of_dish = view.findViewById(R.id.txt_id_table);
            holder.img_image = view.findViewById(R.id.img_table);

            view.setTag(holder);
        }else{
            holder = (DishViewHolder) view.getTag();
        }
        Dish dish = new Dish();
        holder.img_image.setImageBitmap(stringToBitmap(dish.getImageOfDish()));
        holder.txt_name_of_dish.setText(dish.getNameOfDish());
        return view;
    }
}
