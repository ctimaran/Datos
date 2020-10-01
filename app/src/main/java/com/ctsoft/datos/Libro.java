package com.ctsoft.datos;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Libro {
    @PrimaryKey(autoGenerate = true)
    public int Id;
    public String Titulo;
    public String Autor;
    public int Año;
    public String Tema;
    public int mNumPaginas;
}


