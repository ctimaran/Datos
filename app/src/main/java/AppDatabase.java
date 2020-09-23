import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Libro.class, Usuario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LibroDAO libroDAO();
    public abstract UsuarioDAO usuarioDAO();

}
