import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface LibroDAO {

    @Query("SELECT * FROM libro")
    List<Libro> getAll();

    @Query("SELECT * FROM libro  WHERE nombre LIKE :nombrelibro ORDER BY nombre ASC")
    Libro getLibro(String nombrelibro);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(Libro libro);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertAll(Libro... libros);

    @Delete
    void delete(Libro libro);

}
