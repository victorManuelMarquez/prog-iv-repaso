package clases.polimorfismo;

public class Perro extends Animal implements Sonidos, Raza {

    private final String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "; Nombre: " + getNombre() + "; Raza: " + nombreRaza();
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau! Guau!");
    }

    @Override
    public String nombreRaza() {
        return raza;
    }

}
