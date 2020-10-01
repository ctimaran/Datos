package com.ctsoft.datos;

import android.text.Editable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuario_table")
public class Usuario {
    @PrimaryKey
    @NonNull
    public String Usuario;
    public String Nombre;
    public String Apellido;
}
