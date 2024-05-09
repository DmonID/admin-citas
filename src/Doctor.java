import java.io.Serializable;

public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String especialidad;
    private String usuario;
    private String contraseña;

    public Doctor(int id, String nombre, String especialidad, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }
}
