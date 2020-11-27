package ejercicios_bucles;

import java.util.Scanner;

/**
 * numeros primos entre 2 y 100
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = 2;
        double contador = 0;
        while (num <= 100){
            for (int i = 1; i <= num; i++){
            double comprobacion = num % i;
            if (comprobacion == 0){
                contador++;
            } else{
                System.out.print("");
            }
            }
            if (contador < 3){
                System.out.println(num);
            } else{
                System.out.print("");
            }
            num++;
            contador = 0;
        }
    }
}