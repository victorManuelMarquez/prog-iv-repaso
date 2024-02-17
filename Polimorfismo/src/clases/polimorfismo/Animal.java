package clases.polimorfismo;

public abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal: " + getClass().getSimpleName();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
