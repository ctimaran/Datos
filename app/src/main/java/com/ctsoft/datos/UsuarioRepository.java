package com.ctsoft.datos;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class UsuarioRepository {
    private UsuarioDAO mUsuarioDAO;
    private List<Usuario> mUsuarios;

    UsuarioRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        mUsuarioDAO = db.usuarioDAO();
        mUsuarios = mUsuarioDAO.getUsuarios();
    }

    List<Usuario> getUsuarios(){
        return mUsuarios;
    }

    void insert(Usuario usuario){
        AppDatabase.databaseWriteExecutor.execute(()->{
            mUsuarioDAO.insert(usuario);
        });


    }
    void delete(Usuario usuario){
        AppDatabase.databaseWriteExecutor.execute(()->{
          mUsuarioDAO.delete(usuario.Usuario);
        });
    }
}
