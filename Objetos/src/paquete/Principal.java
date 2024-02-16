package paquete;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            Saludame objetoSaludame = new Saludame();
            objetoSaludame.setNombre(scanner.next());
            System.out.println(objetoSaludame.ahora());
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
        System.exit(0);
    }

}
