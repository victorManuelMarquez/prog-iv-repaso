public class Funciones {

    public static void main(String[] args) {
        int n1 = 300, n2 = 125;
        System.out.printf("%d + %d = %d\n", n1, n2, suma(n1, n2));
        System.out.printf("%d - %d = %d\n", n1, n2, resta(n1, n2));
        System.out.printf("%d * %d = %d\n", n1, n2, producto(n1, n2));
        System.out.printf("%d // %d = %d\n", n1, n2, divisionEntera(n1, n2));
        System.out.printf("%d / %d = %.2f\n", n1, n2, division(n1, n2));
        System.exit(0);
    }

    public static int suma(int v1, int v2) {
        return v1 + v2;
    }

    public static int resta(int v1, int v2) {
        return v1 - v2;
    }

    public static int producto(int v1, int v2) {
        return v1 * v2;
    }

    public static int divisionEntera(int v1, int v2) {
        return v1 / v2;
    }

    public static float division(int v1, int v2) {
        return (float) v1 / v2;
    }

}
