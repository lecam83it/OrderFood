package com.example.admin.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.DTO.Dish;
import com.example.admin.Database.CreateDatabase;

/**
 * Created by Admin on 9/13/2017.
 */

public class DishDAO {

    private SQLiteDatabase database;

    public DishDAO(Context context){
        CreateDatabase createDatabase = new CreateDatabase(context);
        database = createDatabase.open();
    }

    public boolean addDish(Dish dish){
        ContentValues contentValues = new ContentValues();

        contentValues.put(CreateDatabase.TB_MONAN_TENMONAN, dish.getNameOfDish());
        contentValues.put(CreateDatabase.TB_MONAN_GIAMONAN, dish.getCostOfDish());
        contentValues.put(CreateDatabase.TB_MONAN_MALOAI, dish.getIdTypeOfDish());
        contentValues.put(CreateDatabase.TB_MONAN_ANH, dish.getIdTypeOfDish());

        long check = database.insert(CreateDatabase.TB_MONAN, null, contentValues);
        return (check != 0);
    }
}
