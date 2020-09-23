import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UsuarioDAO {
    @Query("SELECT * FROM usuario_table WHERE usuario = :nombre_usuario")
    Usuario findByNombre_Usuario(String nombre_usuario);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(Usuario usuario);

    @Query("DELETE FROM usuario_table")
    void deleteAll();

    @Query("SELECT * from usuario_table ORDER BY usuario ASC")
    LiveData<List<Usuario>> getUsuarios();

}
