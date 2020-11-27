package ejercicios_bucles;

import java.util.Scanner;

/**
 * contador de numeros, media de impares y el mayor de los pares
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        double num = 0;
        double suma = 0;
        double mayor = 0;
        double impares = 0;
        double media = 0;
        System.out.print("Introduzca un números y cuando quiera parar ");
        System.out.println("introduzca un número negativo: ");
        while (num >= 0){
            System.out.print("> ");
            num = in.nextDouble();
            if (num % 2 == 0){
                if (num >= mayor){
                    mayor = num;
                }
            } else{
                impares++;
                suma += num;
                media = suma / impares;
            }
            contador++;
        }
        System.out.println("Has introducido " + (contador - 1) + " numeros.");
        System.out.printf("La media de los numeros impares es: %5.2f ", media);
        System.out.println("El mayor de los pares es: " + mayor);
    }
}
