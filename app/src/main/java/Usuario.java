import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "usuario_table")
public class Usuario {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "usuario")
    private String mUsuario;

    private String mNombre;

    private String mApellido;

    public void Usuario(@NonNull String usuario) {this.mUsuario = usuario;}

    public String getUsuario(){
        return this.mUsuario;
    }

    public void Nombre(String nombre) {this.mNombre = nombre;}

    public String getNombre(){
        return this.mNombre;
    }

    public void Apellido(String apellido) {this.mApellido = apellido;}

    public String getmApellido(){
        return this.mApellido;
    }
}
