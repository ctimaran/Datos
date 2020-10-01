package com.ctsoft.datos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private UsuarioViewModel usuarioViewModel;
    private Usuario usuarioActivo;
    private int current;

    private EditText mEditNombre;
    private EditText mEditApellido;
    private EditText mEditUsuario;

    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditApellido = findViewById(R.id.editTextApellido);
        mEditNombre = findViewById(R.id.editTextNombre);
        mEditUsuario = findViewById(R.id.editTextUsuario);
        current = 0;

        usuarioViewModel = new UsuarioViewModel(this.getApplication());
        usuarios = usuarioViewModel.getUsuarios();
        if (usuarios != null) {
            loadCurrent();
        }else{
            usuarioActivo = null;
        }

    }

    private void loadCurrent(){
        usuarioActivo = usuarios.get(current);
        if (usuarioActivo != null) {
            mEditUsuario.setText(usuarioActivo.Usuario);
            mEditApellido.setText(usuarioActivo.Apellido);
            mEditNombre.setText(usuarioActivo.Nombre);
        }
    }
    public void NuevoUsuario(View view){
        mEditNombre.setText("");
        mEditApellido.setText("");
        mEditUsuario.setText("");
    }

    public void GuardarUsuario(View view){
        Usuario usuario;
        if (!TextUtils.isEmpty(mEditUsuario.getText())){
            usuario = new Usuario();
            usuario.Usuario = mEditUsuario.getText().toString();
            usuario.Apellido = mEditApellido.getText().toString();
            usuario.Nombre = mEditNombre.getText().toString();
            usuarioViewModel.insert(usuario);

            usuarios = usuarioViewModel.getUsuarios();

        }
    }

    public void Siguiente(View view){
        if (current < usuarios.size()-1){
            current ++;
            loadCurrent();
        }
    }

    public void Anterior(View view){
        if (current > 0){
            current --;
            loadCurrent();
        }
    }

}