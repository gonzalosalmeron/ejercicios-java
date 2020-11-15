package ejercicios_bucles;

import java.util.Scanner;

/**
 * Comprobar si un número es primo
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número a comprobar: ");
        int numPrimo = in.nextInt();
        int j = 1;
        int contador = 0;
        while (j <= numPrimo){
            int comprobacion = numPrimo % j;
            j++;
            if (comprobacion == 0){
                contador++;
            }else {
            }
        }
        if (contador < 3){
            System.out.println(numPrimo + " es un número primo");
        } else{
            System.out.println(numPrimo + " no es un número primo");
        }
    }
}