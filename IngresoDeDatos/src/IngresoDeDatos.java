import java.util.InputMismatchException;
import java.util.Scanner;

public class IngresoDeDatos {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean incorrecto;
            int num1 = 0, num2 = 0;
            do {
                System.out.print("Ingrese un número: ");
                try {
                    num1 = sc.nextInt();
                    incorrecto = false;
                } catch (InputMismatchException mismatchException) {
                    System.out.println("No ingresaste un número.");
                    incorrecto = true;
                }
            } while (incorrecto);
            do {
                System.out.print("Ingrese un número: ");
                try {
                    num2 = sc.nextInt();
                    incorrecto = false;
                } catch (InputMismatchException mismatchException) {
                    System.out.println("No ingresaste un número.");
                    incorrecto = true;
                }
            } while (incorrecto);
            System.out.println("Operaciones...");
            System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
            System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
            System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
            try {
                System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
                System.out.printf("%d div %d = %d resto %d\n", num1, num2, num1 / num2, num1 % num2);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Math ERROR!");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

}
