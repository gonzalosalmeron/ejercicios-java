package ejercicios_bucles;

import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.print("Por favor, introduzca el número a multiplicar: ");
        int num = in.nextInt();
        while(i < 10){
            i++;
            int multiplicacion = num * i;
            System.out.println(multiplicacion);
        }
    }
}