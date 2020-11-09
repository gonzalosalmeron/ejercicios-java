package ejercicios_bucles;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un número entero y le diré cuántos ");
        System.out.print("dígitos tiene: ");
        int num = in.nextInt();
        int numeroIntroducido = num;
        int numeroDedigitos = 1;
        while (num > 10){
            num /= 10;
            numeroDedigitos++;
        }
        System.out.println(numeroIntroducido + " tiene " + numeroDedigitos);
    }
}