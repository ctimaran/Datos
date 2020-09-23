import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "libro")
public class Libro {
    public Libro(){

    }

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int Id;

    @ColumnInfo (name = "nombre")
    private String mNombre;
    @ColumnInfo (name = "autor")
    private String mAutor;
    @ColumnInfo (name = "editorial")
    private String mEditorial;
    @ColumnInfo (name = "año")
    private int mAño;
    @ColumnInfo (name = "tema")
    private String mTema;
    @ColumnInfo (name = "num_paginas")
    private int mNumPaginas;

    public String getNombre(){
        return mNombre;
    }
    public void setNombre(String nombre){
        this.mNombre = nombre;
    }
    public String getAutor(){
        return mAutor;
    }
    public void setAutor(String autor){
        this.mNombre = autor;
    }
    public int getAño(){
        return mAño;
    }
    public void setAño(int año){this.mAño = año;}
}


