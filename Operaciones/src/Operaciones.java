public class Operaciones {

    public static void main(String[] args) {
        int numA = 17;
        int numB = 7;
        System.out.println("La suma entre " + numA + " + " + numB + " = " + (numA+numB));
        System.out.println("La diferencia entre " + numA + " + " + numB + " = " + (numA-numB));
        System.out.printf("El producto entre %d y %d es = %d\n", numA, numB, numA*numB);
        System.out.printf("La división entera entre %d y %d es = %d con resto %d\n", numA, numB, numA/numB, numA%numB);
        System.out.printf("La división entre %d/%d es = %.1f\n", numA, numB, (float) numA/numB);
        System.out.println("Fin del programa.");
    }

}
