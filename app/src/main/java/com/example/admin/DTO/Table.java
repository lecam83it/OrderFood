package com.example.admin.DTO;

/**
 * Created by Admin on 9/13/2017.
 */

public class Table {
    private int idTable;
    private String nameTable, statusTable;

    public Table() {
    }

    public Table(int idTable, String nameTable, String statusTable) {
        this.idTable = idTable;
        this.nameTable = nameTable;
        this.statusTable = statusTable;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public String getStatusTable() {
        return statusTable;
    }

    public void setStatusTable(String statusTable) {
        this.statusTable = statusTable;
    }
}
