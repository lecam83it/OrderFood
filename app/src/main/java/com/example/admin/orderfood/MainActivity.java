package com.example.admin.orderfood;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.admin.Database.CreateDatabase;
import com.example.admin.Fragment.DishFragment;
import com.example.admin.Fragment.TableFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private NavigationView nav_view;
    private DrawerLayout drawer_layout;
    private FragmentManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        manager = getSupportFragmentManager();


        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer_layout, toolbar,  R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        nav_view = (NavigationView) findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.dish_list:
                manager.beginTransaction().replace(R.id.layout_content, new DishFragment()).addToBackStack(null).commit();
                item.setChecked(true);
                drawer_layout.closeDrawers();
                break;
            case R.id.table_list:
                manager.beginTransaction().replace(R.id.layout_content, new TableFragment()).addToBackStack(null).commit();
                item.setChecked(true);
                drawer_layout.closeDrawers();
                break;
            case R.id.type_of_dish_list:

                break;
        }
        return true;
    }
}
