package clases;

import java.util.Arrays;

public class Profesor extends Persona {

    private String[] materias;

    public Profesor(String dni, String nombreCompleto, int edad) {
        super(dni, nombreCompleto, edad);
        materias = new String[]{};
    }

    public Profesor(String dni, String nombreCompleto, int edad, String[] materias) {
        super(dni, nombreCompleto, edad);
        this.materias = materias;
    }

    @Override
    public String toString() {
        return String.format("Soy docente y me llamo %s, DNI: %s, edad: %d, Materias: %s\n", getNombreCompleto(), getDni(), getEdad(), Arrays.toString(getMaterias()));
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

}
