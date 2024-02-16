package paquete;

public class Saludame {

    private String nombre;

    public String ahora() {
        return "Hola " + getNombre() + "!";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
