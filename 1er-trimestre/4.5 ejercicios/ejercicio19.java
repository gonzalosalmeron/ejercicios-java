package ejercicios_if_switch;

import java.util.Scanner;

/**
 * indicar la primera cifra
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo ");
        System.out.print("o negativo no mayor de 5 cifras: ");
        int num = in.nextInt();
        int cifra = 0;
        if (num > 100000){
            System.out.println("El número debe de tener menos de 5 cifras");
        } else {
            if (num < 10){
                cifra = num;
            }
            if (num > 10 && num < 100){
                cifra = num / 10;
            }
            if (num > 100 && num < 1000){
                cifra = num / 100;
            }
            if (num > 1000 && num < 10000){
                cifra = num / 1000;
            }
            if (num > 10000 && num < 100000){
                cifra = num / 10000;
            }
            if (num < -10){
                cifra = num;
            }
            if (num < -10 && num > -100){
                cifra = num / -10;
            }
            if (num < -100 && num > -1000){
                cifra = num / -100;
            }
            if (num < -1000 && num > -10000){
                cifra = num / -1000;
            }
            if (num < -10000 && num > -100000){
                cifra = num / -10000;
            }
            System.out.println("La primera cifra es " + cifra);
        }
    }
}