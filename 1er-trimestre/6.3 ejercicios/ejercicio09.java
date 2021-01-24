package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * generar numeros pares y encontrar el número 24
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        while (num != 24){
            num = (int) (Math.random()*50 + 1);
            num = num * 2;
            contador++;
        }
        System.out.println("Para encontrar el 24, hemos generado " + contador + " números.");
    }
}
