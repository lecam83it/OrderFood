package com.example.admin.DTO;

import android.graphics.Bitmap;

/**
 * Created by Admin on 9/13/2017.
 */

public class Dish {

    private int idOfDish, idTypeOfDish;
    private String nameOfDish, costOfDish, imageOfDish;

    public Dish() {
    }



    public Dish(int idOfDish, int idTypeOfDish, String nameOfDish, String costOfDish, String imageOfDish) {
        this.idOfDish = idOfDish;
        this.idTypeOfDish = idTypeOfDish;
        this.nameOfDish = nameOfDish;
        this.costOfDish = costOfDish;
        this.imageOfDish = imageOfDish;
    }

    public int getIdOfDish() {
        return idOfDish;
    }

    public void setIdOfDish(int idOfDish) {
        this.idOfDish = idOfDish;
    }

    public int getIdTypeOfDish() {
        return idTypeOfDish;
    }

    public void setIdTypeOfDish(int idTypeOfDish) {
        this.idTypeOfDish = idTypeOfDish;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public String getCostOfDish() {
        return costOfDish;
    }

    public void setCostOfDish(String costOfDish) {
        this.costOfDish = costOfDish;
    }

    public String getImageOfDish() {
        return imageOfDish;
    }

    public void setImageOfDish(String imageOfDish) {
        this.imageOfDish = imageOfDish;
    }

}
