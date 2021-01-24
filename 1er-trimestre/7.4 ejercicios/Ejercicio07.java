package ejercicios_bucles;

import java.util.Scanner;

/**
 * leer 15 num y cambiarlos de posición
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] numAleatorio = new int[20];
        
        for (int i = 0; i < numAleatorio.length; i++){
            numAleatorio[i] = (int) (Math.random()*21);
        }
        for (int listaOrdenada : numAleatorio){
            System.out.print(listaOrdenada + " ");
        }
        System.out.print("Por favor, introduce un número: ");
        int numero1 = in.nextInt();
        System.out.print("Introduce un segundo número: ");
        int numero2 = in.nextInt();
        
        for (int i = 0; i < numAleatorio.length; i++){
            if (numero1 == i){
                System.out.print ("'" + numAleatorio[numero2] + "' ");
            } else if (numero2 == i){
                System.out.print("'" + numAleatorio[numero1] + "' ");
            } else {
                System.out.print(numAleatorio[i] + " ");
            }
        }
    }
}
