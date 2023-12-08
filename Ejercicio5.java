/**
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de
 * una
 * empresa y detectar si existe brecha salarial entre ambos. El programa pedirá
 * por teclado la
 * información de N personas distintas (valor también introducido por teclado).
 * Para cada
 * persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
 * información debe
 * guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio
 * de cada
 * género.
 * 
 * @author Fernando Lara Millan
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int numPersonas = Integer.parseInt(System.console().readLine("Introduce el número de personas: "));

        int[][] array = new int[numPersonas][2];

        // metemos la informacion de cada persona en el array
        for (int i = 0; i < numPersonas; i++) {
            array[i][0] = Integer.parseInt(System.console()
                    .readLine("Introduce el género de la persona " + (i + 1) + "(usa 0 para hombre y 1 para mujer): "));
            array[i][1] = Integer
                    .parseInt(System.console().readLine("Introduce el sueldo de la persona " + (i + 1) + ": "));
        }

        // Calcular el sueldo medio por género
        double sueldoMedHombres = 0, sueldoMedMujeres = 0;
        int contHombres = 0, contMujeres = 0;

        for (int i = 0; i < numPersonas; i++) {
            int genero = array[i][0];
            int sueldo = array[i][1];

            if (genero == 0) {
                sueldoMedHombres += sueldo;
                contHombres++;
            } else if (genero == 1) {
                sueldoMedMujeres += sueldo;
                contMujeres++;
            }
        }

        // Calcular el sueldo medio de hombres y mujeres
        if (contHombres > 0) {
            sueldoMedHombres /= contHombres;
        }

        if (contMujeres > 0) {
            sueldoMedMujeres /= contMujeres;
        }
        System.out.println();
        System.out.println("Sueldo medio de los hombres: " + sueldoMedHombres);
        System.out.println("Sueldo medio de las mujeres: " + sueldoMedMujeres);
    }
}
