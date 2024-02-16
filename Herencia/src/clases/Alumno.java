package clases;

public class Alumno extends Persona {

    public Alumno(String dni, String nombreCompleto, int edad) {
        super(dni, nombreCompleto, edad);
    }

    @Override
    public String toString() {
        return String.format("Soy un alumno y me llamo %s, DNI: %s; edad=%d\n", getDni(), getNombreCompleto(), getEdad());
    }

}
