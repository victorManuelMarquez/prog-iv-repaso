package clases;

public class Principal {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("28.993.130", "Gastón Ernesto Tolaba", 41, new String[]{"Física I", "Física II"});
        Alumno[] alumnos = new Alumno[]{
                new Alumno("54.222.023", "Sofía M. Gutierrez", 17),
                new Alumno("53.090.201", "Nicole Serrano", 16),
                new Alumno("52.822.113", "Fabián Gonzalo Choque", 18)
        };
        System.out.println(profesor);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        System.exit(0);
    }

}
