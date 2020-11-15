package ejercicios_bucles;

import java.util.Scanner;

/**
 * Estructura de fibonacci
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Serie de Fibonacci");
        System.out.print("El primer término es 0, por favor, introduce el ");
        System.out.print("segundo término: ");
        int num1 = in.nextInt();
        System.out.println("0");
        System.out.println(num1);
        int fibonacci = 0;
        for (int i = 0; i < 160;){
            fibonacci = num1 + i;
            num1 = i;
            i = fibonacci;
            System.out.println(fibonacci);
        }
    }
}