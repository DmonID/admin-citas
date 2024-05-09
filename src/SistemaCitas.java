import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCitas {
    private List<Doctor> doctores;
    private List<Paciente> pacientes;
    private List<Cita> citas;
    private Administrador administrador;

    public SistemaCitas() {
        doctores = new ArrayList<>();
        pacientes = new ArrayList<>();
        citas = new ArrayList<>();
        administrador = new Administrador("admin", "admin123"); // Usuario y contraseña del administrador
    }

    public void altaDoctores(Doctor doctor) {
        doctores.add(doctor);
    }

    public void altaPacientes(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void crearCita(Cita cita) {
        citas.add(cita);
    }

    public void guardarDatos() {
        try {
            FileOutputStream fos = new FileOutputStream("doctores.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(doctores);
            oos.close();

            fos = new FileOutputStream("pacientes.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(pacientes);
            oos.close();

            fos = new FileOutputStream("citas.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(citas);
            oos.close();

            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void cargarDatos() {
        try {
            FileInputStream fis = new FileInputStream("doctores.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            doctores = (List<Doctor>) ois.readObject();
            ois.close();

            fis = new FileInputStream("pacientes.dat");
            ois = new ObjectInputStream(fis);
            pacientes = (List<Paciente>) ois.readObject();
            ois.close();

            fis = new FileInputStream("citas.dat");
            ois = new ObjectInputStream(fis);
            citas = (List<Cita>) ois.readObject();
            ois.close();

            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    // Otros métodos para interactuar con los datos, como guardar y cargar desde archivos

    public static void main(String[] args) {
        SistemaCitas sistema = new SistemaCitas();
        sistema.cargarDatos();
        sistema.iniciarSistema();
        sistema.guardarDatos();
    }

    public void iniciarSistema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de administración de citas");

        // Control de acceso
        if (!controlAcceso()) {
            System.out.println("Usted no tiene acceso al sistema como administrador");
            return;
        }

        System.out.println("Menú Principal");
        System.out.println("1. Alta Doctores");
        System.out.println("2. Alta Pacientes");
        System.out.println("3. Crear Cita");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()

        switch (opcion) {
            case 1:
                registrarDoctor();
                break;
            case 2:
                registrarPaciente();
                break;
            case 3:
                crearCita();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private boolean controlAcceso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        return usuario.equals(administrador.getUsuario()) && contraseña.equals(administrador.getContraseña());
    }

    private void registrarDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del doctor:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la especialidad:");
        String especialidad = scanner.nextLine();
        System.out.println("Ingrese el usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese la contraseña:");
        String contraseña = scanner.nextLine();

        Doctor doctor = new Doctor(doctores.size() + 1, nombre, especialidad, usuario, contraseña);
        altaDoctores(doctor);
        System.out.println("Doctor registrado con éxito.");
    }

    private void registrarPaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el historial médico:");
        String historialMedico = scanner.nextLine();
        System.out.println("Ingrese el usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese la contraseña:");
        String contraseña = scanner.nextLine();

        Paciente paciente = new Paciente(pacientes.size() + 1, nombre, historialMedico, usuario, contraseña);
        altaPacientes(paciente);
        System.out.println("Paciente registrado con éxito.");
    }

    private void crearCita() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de la cita:");
        String fecha = scanner.nextLine();
        System.out.println("Ingrese la hora de la cita:");
        String hora = scanner.nextLine();

        // Mostrar lista de doctores
        System.out.println("Lista de doctores disponibles:");
        for (Doctor doctor : doctores) {
            System.out.println(doctor.getId() + ". " + doctor.getNombre() + " - " + doctor.getEspecialidad());
        }
        System.out.println("Seleccione el número del doctor:");
        int doctorId = scanner.nextInt();
        Doctor doctorSeleccionado = null;
        for (Doctor doctor : doctores) {
            if (doctor.getId() == doctorId) {
                doctorSeleccionado = doctor;
                break;
            }
        }

        // Mostrar lista de pacientes
        System.out.println("Lista de pacientes disponibles:");
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getId() + ". " + paciente.getNombre());
        }
        System.out.println("Seleccione el número del paciente:");
        int pacienteId = scanner.nextInt();
        Paciente pacienteSeleccionado = null;
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == pacienteId) {
                pacienteSeleccionado = paciente;
                break;
            }
        }

        Cita cita = new Cita(citas.size() + 1, fecha, hora, doctorSeleccionado, pacienteSeleccionado);
        crearCita(cita);
        System.out.println("Cita creada con éxito.");
    }
}
