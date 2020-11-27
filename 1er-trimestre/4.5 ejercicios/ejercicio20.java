package ejercicios_if_switch;

import java.util.Scanner;

/**
 * indicar la primera cifra
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo ");
        System.out.print("no mayor de 5 cifras: ");
        int num = in.nextInt();
        int cifra = 0;
        int ultimaCifra = 0;
        if (num > 100000){
            System.out.println("El número debe de tener menos de 5 cifras");
        } else {
            int cifra1 = 0;
            int cifra2 = 0;
            int cifra3 = 0;
            int cifra4 = 0;
            if (num < 10){
                cifra = num;
            }
            if (num > 10 && num < 100){
                cifra = num / 10;
                cifra1 = cifra;
                cifra4 = num % 10;
            }
            if (num > 100 && num < 1000){
                cifra = num / 100;
                cifra1 = cifra;
                cifra4 = num % 10;
            }
            if (num > 1000 && num < 10000){
                cifra = num / 1000;
                cifra1 = cifra;
                cifra2 = (num / 100) % 10;
                cifra3 = (num / 10) % 10;
                cifra4 = num % 10;
            }
            if (num > 10000 && num < 100000){
                cifra = num / 10000;
                cifra1 = cifra;
                cifra2 = (num / 1000) % 10;
                cifra3 = (num / 10) % 10;
                cifra4 = num % 10;
            }
            if (cifra1 == cifra4 && cifra2 == cifra3){
                System.out.println("El número " + num + " es capicúa");
            } else{
                System.out.println("El número " + num + " no es capicúa");
            }
        }
    }
}