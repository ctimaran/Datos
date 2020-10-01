package com.ctsoft.datos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LibroDAO {

    @Query("SELECT * FROM libro")
    LiveData<List<Libro>> getAll();

    @Query("SELECT * FROM libro  WHERE titulo LIKE :titulolibro ORDER BY titulo ASC")
    Libro getLibro(String titulolibro);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(Libro libro);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Libro... libros);

    @Delete
    void delete(Libro libro);

}
