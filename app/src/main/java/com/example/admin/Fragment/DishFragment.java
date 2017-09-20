package com.example.admin.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.Adapter.DishAdapter;
import com.example.admin.DTO.Dish;
import com.example.admin.orderfood.DishActivity;
import com.example.admin.orderfood.MainActivity;
import com.example.admin.orderfood.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DishFragment extends Fragment {

    private ListView lvDish;
    private DishAdapter adapter;
    private ArrayList<Dish> listMonAn;

    public DishFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dish, container, false);
        setHasOptionsMenu(true);
        ActionBar actionBar = ((MainActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle(R.string.dish_list);
//        actionBar.setDisplayHomeAsUpEnabled(true);

        addControls(view);

        return view;
    }

    private void addControls(View view) {
        lvDish = view.findViewById(R.id.lv_dish);
        listMonAn = new ArrayList<>();
        adapter = new DishAdapter(getActivity(), R.layout.dish_item, listMonAn);
        lvDish.setAdapter(adapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        MenuItem item = menu.add(1, R.id.dish_list, 1 , R.string.add_dish_title);
        item.setIcon(R.drawable.dish_plus);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.dish_list:
                Intent intent = new Intent(getActivity(), DishActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
