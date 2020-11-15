package ejercicios_bucles;

import java.util.Scanner;

/**
 * Sumar los 100 siguentes núemros
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo");
        double num = in.nextDouble();
        double comprobar = num % 1;
        while (comprobar != 0){
            System.out.println("Por favor, introduzca un número entero positivo");
            num = in.nextDouble();
            comprobar = num % 1;
            while (num < 0){
                System.out.println("Por favor, introduzca un número entero positivo");
                num = in.nextDouble();
            }
        }
        double suma = 0;
        for (double i = num; i < num + 100; i++){
            suma = suma + i;
            System.out.print(suma + " | ");
            
        }
    }
}