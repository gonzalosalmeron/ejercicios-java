package ejercicios_bucles;

import java.util.Scanner;

/**
 * leer 15 num y cambiarlos de posición
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[15];
        for (int i = 0; i < num.length; i++){
            System.out.print("Introduce el número " + (i + 1) + ": ");
            num[i] = in.nextInt();
        }
        int[] numRotado = new int[15];
        for (int i = 0; i < (num.length - 1); i++){
            numRotado[i + 1] = num[i];
        }
        numRotado[0] = num[14];
        for (int lista : numRotado){
            System.out.println(lista);
        }
    }
}
