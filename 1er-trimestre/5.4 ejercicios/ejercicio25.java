package ejercicios_bucles;

import java.util.Scanner;

/**
 * mostrar número del revés
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num = in.nextInt();
        
        int numReves = 0;
        int ultimoNum = 0;
        while (num > 0){
            ultimoNum = num % 10;
            num = num / 10;
            System.out.print(ultimoNum + "");
        }
    }
}
