/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
 * “Alumno
 * 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
 * teclado y luego el
 * programa mostrará la nota mínima, máxima y media de cada alumno.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // definir asi por si se desea cambiar los valores en un futuro, incluso pedir
        // numeros especificos
        int numAlumnos = 4;
        int numAsignaturas = 5;

        double[][] notas = new double[numAlumnos][numAsignaturas];

        // for para meter las notas de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numAsignaturas; j++) {
                notas[i][j] = Double.parseDouble(System.console()
                        .readLine("Introduce la nota del alumno " + (i + 1) + " en la Asignatura " + (j + 1) + ": "));
            }
        }

        // Mostrar la nota mínima, máxima y media de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            double minima = 999;
            double maxima = 0;
            double suma = 0;

            for (int j = 0; j < numAsignaturas; j++) {
                double nota = notas[i][j];

                // Actualizar la nota mínima y máxima
                if (nota < minima) {
                    minima = nota;
                }
                if (nota > maxima) {
                    maxima = nota;
                }
                suma += nota;
            }
            double media = suma / numAsignaturas;

            System.out.println();
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("  Nota mínima: " + minima);
            System.out.println("  Nota máxima: " + maxima);
            System.out.println("  Nota media: " + media);
            System.out.println();
        }
    }
}
