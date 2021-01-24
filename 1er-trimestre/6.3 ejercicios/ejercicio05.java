package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * 50 numeros aleatorios entre 100 y 199 mostrando el minimo, maximo y media
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int menor = 199;
        int mayor = 0;
        int suma = 0;
        System.out.print("50 num aleatorios: ");
        for (int i = 0; i < 50; i++){
            num = (int) (Math.random()* 100 + 100);
            if (num < menor){
                menor = num;
            }
            if (num > mayor){
                mayor = num;
            }
            suma += num;
            System.out.print(num + " ");
        }
        int media = suma / 50;
        System.out.println("\nEl mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La media es: " + media);
    }
}