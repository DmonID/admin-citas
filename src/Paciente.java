import java.io.Serializable;

public class Paciente implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String historialMedico;
    private String usuario;
    private String contraseña;

    public Paciente(int id, String nombre, String historialMedico, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.historialMedico = historialMedico;
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

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
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
        return "Paciente [id=" + id + ", nombre=" + nombre + ", historialMedico=" + historialMedico + "]";
    }
}
