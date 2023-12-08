/**
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene los números
 * del 1 al 25
 * y luego muestre la matriz por pantalla.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Lleno la matriz con números del 1 al 25
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = contador++;
            }
        }

        mostrarMatriz(matriz);
    }

    /**
     * Funcion mostrarMatriz. Con esta funcion simplemente muestro toda la matriz
     * pasasda como parámentro
     * 
     * @param matriz que se le pasa como parámetro
     */
    private static void mostrarMatriz(int[][] matriz) {

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
