/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
 * teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego
 * deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero,
 * cuántos son
 * menores que cero y cuántos son igual a cero.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        int filas = Integer.parseInt(System.console().readLine("Introduce el número de filas: "));
        int columnas = Integer.parseInt(System.console().readLine("Introduce el número de columnas: "));

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(
                        System.console().readLine("Introduce el valor para la posición [" + i + "][" + j + "]: "));
            }
        }
        System.out.println();
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int mayoresCero = 0, menoresCero = 0, igualesCero = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
        }
        System.out.println();
        System.out.println("Valores mayores que cero: " + mayoresCero);
        System.out.println("Valores menores que cero: " + menoresCero);
        System.out.println("Valores iguales a cero: " + igualesCero);
    }
}
