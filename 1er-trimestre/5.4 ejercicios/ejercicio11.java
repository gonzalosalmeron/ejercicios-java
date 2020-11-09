package ejercicios_bucles;

import java.util.Scanner;

/**
 * Calcular la nota media de números positivos
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double entero = 1.1;
        while (entero != 0){
            System.out.println("Por favor, introduzca un número entero");
            double num = in.nextDouble();
            entero = num % 1;
            if (entero == 0){
                for (int i = 0 ; i < 5; i++){
                    System.out.printf("%7.0f | %5.0f | %5.0f", num, num * num, num * num * num);
                    System.out.println(" ");
                    num++;
                }
            } else{
                System.out.println("Ese no es un número entero.");
            }
        }
    }
}

