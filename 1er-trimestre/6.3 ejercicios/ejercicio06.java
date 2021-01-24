package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * adivinar numero
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intento = 5;
        int numIntroducido = 0;
        int num = (int) (Math.random()*101);
        while (intento > 0 && numIntroducido != num){
            System.out.println("Adivina el número: ");
            numIntroducido = in.nextInt();
            System.out.println(num);
            if (numIntroducido == num){
                System.out.println("Enhorabuena, lo has acertado");
            } else if (numIntroducido < num){
                intento--;
                System.out.println("Te quedan " + intento + " intentos.");
                System.out.println("El número introducido es menor que el número a adivinar");
            } else if (numIntroducido > num){
                intento--;
                System.out.println("Te quedan " + intento + " intentos.");
                System.out.println("El número introducido es mayor que el número a adivinar");
            }
        }
        if (intento == 0){
            System.out.println("\n****************************************");
            System.out.println("Lo siento, te has quedado sin intentos.");
        }

    }
}