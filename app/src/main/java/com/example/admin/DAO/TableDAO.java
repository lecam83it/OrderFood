package com.example.admin.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.admin.DTO.Table;
import com.example.admin.Database.CreateDatabase;

/**
 * Created by Admin on 9/13/2017.
 */

public class TableDAO {

    private SQLiteDatabase database;

    public TableDAO(Context context){
        CreateDatabase createDatabase = new CreateDatabase(context);
        database = createDatabase.open();
    }

    public long addTable(Table table){

        ContentValues contentValues = new ContentValues();
        contentValues.put(CreateDatabase.TB_BANAN_TENBAN, table.getNameTable());
        contentValues.put(CreateDatabase.TB_BANAN_TINHTRANG, table.getStatusTable());

        long check = database.insert(CreateDatabase.TB_BANAN, null, contentValues);
        return check;
    }
}
