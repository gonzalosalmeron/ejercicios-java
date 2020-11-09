package ejercicios_bucles;

import java.util.Scanner;

/**
 * Calcular la nota media de números positivos
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double expo = -1.1;
        System.out.print("Por favor, introduzca una base: ");
        double base = in.nextDouble();
        while(expo < 0){
            System.out.print("Por favor, introduzca un exponente entero positivo: ");
            expo = in.nextDouble();
            double comprobacion = expo % 1;
            while(comprobacion != 0){
                System.out.print("Por favor, introduzca un exponente entero positivo: ");
                expo = in.nextDouble();
                comprobacion = expo % 1;
            }
        }
        System.out.println("El resultado es: " + Math.pow(base, expo));
    }
}