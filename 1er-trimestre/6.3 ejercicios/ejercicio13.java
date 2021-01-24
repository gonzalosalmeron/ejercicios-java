package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * generar resultado de dos dados hasta que coincidan
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dado1 = 0;
        int dado2 = 1;
        while (dado1 != dado2 && dado2 != dado1){
            dado1 = (int) (Math.random()*6 + 1);
            dado2 = (int) (Math.random()*6 + 1);
        }
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
    }
}
