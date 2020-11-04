package ejercicios_bucles;

import java.util.Scanner;

/**
 * Abrir caja fuerte
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int clave = 0;
        do {
            System.out.println("----------------------------------------");
            System.out.println("Por favor, introduzca la clave: ");
            clave = in.nextInt();
            i++;
            if (clave == 3719){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
        } while(i < 4 || clave != 3719);
    }
}


