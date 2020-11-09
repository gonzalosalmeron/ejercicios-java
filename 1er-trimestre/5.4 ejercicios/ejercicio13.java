package ejercicios_bucles;

import java.util.Scanner;

/**
 * Calcular la nota media de números positivos
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cuentaAtras = 0;
        int pos = 0;
        int neg = 0;
        System.out.println("Por favor, introduzca 10 números");
        while (cuentaAtras < 10){
            System.out.print("> ");
            cuentaAtras++;
            double num = in.nextInt();
            if (num >= 0){
                pos++;
            } else if (num < 0){
                neg++;
            }
        }
        System.out.print("Has introducido " + pos + " numeros positivos y ");
        System.out.println(neg + " negativos");
    }
}