package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * 20 numeros aleatorios separados por espacios
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            int num = (int) (Math.random()*11);
            System.out.print(num + " ");
        }
    }
}