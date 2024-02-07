import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese algún valor: ");
            String valor = sc.next();
            System.out.println("Usted ingresó [" + valor + "]");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }

}
