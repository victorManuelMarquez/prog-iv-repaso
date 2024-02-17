package clases.polimorfismo;

public class Gato extends Animal implements Sonidos, Raza {

    private final String raza;

    public Gato(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "; Nombre: " + getNombre() + "; Raza: " + nombreRaza();
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miau! Miau!");
    }

    @Override
    public String nombreRaza() {
        return raza;
    }

}
