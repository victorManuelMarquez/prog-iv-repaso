package clases;

public class Persona {

    private String dni, nombreCompleto;
    private int edad;

    public Persona(String dni, String nombreCompleto, int edad) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
