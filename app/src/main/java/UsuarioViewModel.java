import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class UsuarioViewModel extends AndroidViewModel {
    private  UsuarioRepository mRepository;
    private LiveData<List<Usuario>> mUsuarios;

    public UsuarioViewModel (Application application){
        super(application);
        mRepository = new UsuarioRepository(application);
        mUsuarios = mRepository.getUsuarios();
    }
    LiveData<List<Usuario>> getUsuarios() {return  mUsuarios;}
    public void insert(Usuario usuario) {mRepository.insert(usuario);}
}
