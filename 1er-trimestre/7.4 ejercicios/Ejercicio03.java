package ejercicios_bucles;

import java.util.Scanner;

/**
 * muestra 10 números del array al revés
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[10];
        for (int i = 1; i < 11; i++){
            System.out.print("Por favor, introduzca el número " + i + ": ");
            num[i - 1] = in.nextInt();
        }
        
        System.out.println("Los números introducidos en orden contrario son: ");
        for (int i = 9; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
