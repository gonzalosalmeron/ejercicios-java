package ejercicios_bucles;

import java.util.Scanner;

/**
 * decir si un número par o impar
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[8];
        for (int i = 0; i < num.length; i++){
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            num[i] = in.nextInt();
        }
        int comprobador = 0;
        for (int lista : num){
            comprobador = lista % 2;
            if (comprobador == 0){
                System.out.println(lista + " par");
            } else {
                System.out.println(lista + " impar");
            }
        }
    }
}
