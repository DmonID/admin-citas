import java.io.Serializable;

public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String fecha;
    private String hora;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(int id, String fecha, String hora, Doctor doctor, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", doctor=" + doctor + ", paciente="
                + paciente + "]";
    }
}
