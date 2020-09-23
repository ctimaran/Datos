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

    @ColumnInfo(name = "nombre")
    private String mNombre;

    @ColumnInfo(name = "apellido")
    private String mApellido;

    //setter
    public void setUsuario(@NonNull String usuario) {this.mUsuario = usuario;}
    //getter
    public String getUsuario(){
        return this.mUsuario;
    }

    public void setNombre(String nombre) {this.mNombre = nombre;}

    public String getNombre(){
        return this.mNombre;
    }

    public void setApellido(String apellido) {this.mApellido = apellido;}

    public String getApellido(){
        return this.mApellido;
    }
}
