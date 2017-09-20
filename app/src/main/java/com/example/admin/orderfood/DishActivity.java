package com.example.admin.orderfood;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class DishActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView addDish;
    public static final int REQUEST_CODE_OPEN_IMAGE = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        addDish = (ImageView) findViewById(R.id.image_add_dish);

        addDish.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.image_add_dish:
                Intent intentOpenImage = new Intent();
                intentOpenImage.setType("image/*");
                intentOpenImage.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intentOpenImage, "Mo Hinh"), REQUEST_CODE_OPEN_IMAGE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_OPEN_IMAGE && resultCode == Activity.RESULT_OK){
//            addDish.setImageURI(data.getData());
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data.getData());
                addDish.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
