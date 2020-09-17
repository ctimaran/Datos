import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class UsuarioRepository {
    private UsuarioDAO mUsuarioDAO;
    private LiveData<List<Usuario>> mUsuarios;

    UsuarioRepository(Application application){
        UsuarioRoomDatabase db = UsuarioRoomDatabase.getDatabase(application);
        mUsuarioDAO = db.usuarioDAO();
        mUsuarios = mUsuarioDAO.getAlphabetizedUsuarios();
    }
    LiveData<List<Usuario>> getUsuarios(){
        return mUsuarios;
    }
    void insert(Usuario usuario){
        UsuarioRoomDatabase.databaseWriteExecutor.execute(()->{
            mUsuarioDAO.insert(usuario);
        });
    }
}
