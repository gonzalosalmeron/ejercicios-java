package ejercicios_bucles;

import java.util.Scanner;

/**
 * Calcular la nota media de números positivos
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca números positivos para sumar, ");
        System.out.println("cuando quiera parar introduzca un número negativo.");
        int num = 0;
        int numTotal = 0;
        while (num >= 0){
            System.out.print("> ");
            num = in.nextInt();
            if (num >= 0){
            numTotal = num + numTotal;
            } else{
                System.out.println("La suma es de: " + numTotal);
            }
        }
    }
}