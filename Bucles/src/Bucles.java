import java.util.*;

public class Bucles {

    public static void main(String[] args) {
        final int TOTAL = 5;
        int i = 0;
        boolean incorrecto;
        int[] vector = new int[TOTAL];
        try (Scanner scanner = new Scanner(System.in)) {
            while (i < TOTAL) {
                do {
                    try {
                        System.out.printf("(%d/%d) Ingrese un número: ", i + 1, TOTAL);
                        vector[i] = scanner.nextInt();
                        i++;
                        incorrecto = false;
                    } catch (InputMismatchException mismatchException) {
                        System.out.println("NaN");
                        scanner.next(); // LIMPIAR BUFFER!
                        incorrecto = true;
                    }
                } while (incorrecto);
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
        System.out.print("| ");
        for (i=0; i<TOTAL; i++) {
            System.out.printf("%d | ", vector[i]);
        }
        System.out.println("\nFin del programa.");
        System.exit(0);
    }

}
