package ejercicios_bucles;

import java.util.Scanner;

/**
 * array de 10 números
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] simbolo = new String[10];
        
        simbolo[0] = "a";
        simbolo[1] = "-2";
        simbolo[2] = " ";
        simbolo[3] = " ";
        simbolo[4] = "@";
        simbolo[5] = " ";
        simbolo[6] = " ";
        simbolo[7] = "+";
        simbolo[8] = "Q";
        simbolo[9] = " ";
        
        for (int i = 0; i < 10; i++){
            System.out.print(simbolo[i] + " ");
        }
    }
}
