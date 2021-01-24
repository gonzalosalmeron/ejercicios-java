package ejercicios_bucles;

import java.util.Scanner;

/**
 * leer 10 num y luego mostrarlos con máximo y mínimo
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++){
            System.out.print("Por favor introduzca el num " + (i + 1) + ": ");
            num[i] = in.nextInt();
        }
        int maximo = 0;
        for (int i = 0; i < num.length; i++){
            if (maximo < num[i]){
                maximo = num[i];
            }
        }
        int minimo = maximo;
        for (int i = 0; i < num.length; i++){
            if (minimo > num[i]){
                minimo = num[i];
            }
        }
        System.out.println("\n -----------------------------------------");
        for (int lista : num){
            if (lista == maximo){
            System.out.println(lista + " máximo");
            } else if (lista == minimo){
                System.out.println(lista + " mínimo");
            } else {
                System.out.println(lista);
            }
        }
    }
}
