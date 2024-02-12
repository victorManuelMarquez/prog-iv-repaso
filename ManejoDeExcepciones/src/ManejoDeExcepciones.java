import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            System.out.printf("%d**%d = %d\n", num, num, num*num);
        } catch (InputMismatchException mismatchException) {
            System.out.println("NaN : No es un número.");
        }
    }

}
