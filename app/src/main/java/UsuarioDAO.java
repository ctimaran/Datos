import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UsuarioDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(Usuario usuario);
    @Query("DELETE FROM usuario_table")
    void deleteAll();
    @Query("SELECT * from usuario_table ORDER BY usuario ASC")
    LiveData<List<Usuario>> getAlphabetizedUsuarios();
}
