package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * numeros aleatorios 
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumaDados = 0;
        for (int i = 0; i < 3; i++){
            int dado = (int)(Math.random()*6 + 1);
            System.out.println(dado);
            sumaDados += dado;
        }
        System.out.println("La suma de la tirada ha sido: " + sumaDados);
    }
}
