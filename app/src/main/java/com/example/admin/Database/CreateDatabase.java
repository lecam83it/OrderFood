package com.example.admin.Database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 9/11/2017.
 */

public class CreateDatabase extends SQLiteOpenHelper{

    public static final String TB_MONAN = "MONAN";
    public static final String TB_LOAIMONAN = "LOAIMONAN";
    public static final String TB_BANAN = "BANAN";
    public static final String TB_DSGOIMON = "DSGOIMON";
    public static final String TB_CHITIETGOIMON = "CHITIETGOIMON";


    public static final String TB_MONAN_MAMONAN = "MAMONAN";
    public static final String TB_MONAN_TENMONAN = "TENMONAN";
    public static final String TB_MONAN_GIAMONAN = "GIAMONAN";
    public static final String TB_MONAN_MALOAI = "MALOAI";
    public static final String TB_MONAN_ANH = "ANHMONAN";


    public static final String TB_LOAIMONAN_MALOAI = "MALOAI";
    public static final String TB_LOAIMONAN_TENLOAI = "TENLOAI";

    public static final String TB_BANAN_MABAN = "MABAN";
    public static final String TB_BANAN_TENBAN = "TENBAN";
    public static final String TB_BANAN_TINHTRANG = "TINHTRANG";

    public static final String TB_DSGOIMON_MAGOIMON = "MAGOIMON";
    public static final String TB_DSGOIMON_NGAYGOIMON = "NGAYGOIMON";
    public static final String TB_DSGOIMON_TINHTRANG = "TINHTRANG";
    public static final String TB_DSGOIMON_MABAN = "MABAN";

    public static final String TB_CHITIETGOIMON_MAGOIMON = "MAGOIMON";
    public static final String TB_CHITIETGOIMON_MAMONAN = "MAMONAN";
    public static final String TB_CHITIETGOIMON_SOLUONG = "SOLUONG";



    public CreateDatabase(Context context) {
        super(context, "Order Food", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String tbBANAN = String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT )" , TB_BANAN, TB_BANAN_MABAN, TB_BANAN_TENBAN, TB_BANAN_TINHTRANG);
        String tbMONAN = String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s INTEGER, %s TEXT)" , TB_MONAN, TB_MONAN_MAMONAN, TB_MONAN_TENMONAN, TB_MONAN_GIAMONAN, TB_MONAN_MALOAI, TB_MONAN_ANH);
        String tbLOAIMONAN = String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT )" , TB_LOAIMONAN, TB_LOAIMONAN_MALOAI, TB_LOAIMONAN_TENLOAI);
        String tbDSGOIMON = String.format("CREATE TABLE %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s INTEGER )" , TB_DSGOIMON, TB_DSGOIMON_MAGOIMON, TB_DSGOIMON_NGAYGOIMON, TB_DSGOIMON_TINHTRANG, TB_DSGOIMON_MABAN);
        String tbCHITIETGOIMON = String.format("CREATE TABLE %s ( %s INTEGER, %s INTEGER, %s INTEGER, PRIMARY KEY ( %s , %s ))" , TB_CHITIETGOIMON, TB_CHITIETGOIMON_MAGOIMON, TB_CHITIETGOIMON_MAMONAN, TB_CHITIETGOIMON_SOLUONG, TB_CHITIETGOIMON_MAGOIMON, TB_CHITIETGOIMON_MAMONAN);

        sqLiteDatabase.execSQL(tbBANAN);
        sqLiteDatabase.execSQL(tbMONAN);
        sqLiteDatabase.execSQL(tbLOAIMONAN);
        sqLiteDatabase.execSQL(tbDSGOIMON);
        sqLiteDatabase.execSQL(tbCHITIETGOIMON);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public SQLiteDatabase open(){
        return this.getWritableDatabase();
    }

}
