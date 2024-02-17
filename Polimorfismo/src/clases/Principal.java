package clases;

import clases.polimorfismo.*;

public class Principal {

    public static void main(String[] args) {
        // Uso de la clase padre
        Animal perro = new Perro("Tommy", "Beagle");
        System.out.println(perro);
        Animal gato = new Gato("Tom", "Común");
        System.out.println(gato);
        // Casting necesario ya que se usó la clase padre que no implementa dicha interfaz
        ((Sonidos) gato).emitirSonido();
        ((Sonidos) perro).emitirSonido();
    }

}
