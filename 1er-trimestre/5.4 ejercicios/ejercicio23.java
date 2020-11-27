package ejercicios_bucles;

import java.util.Scanner;

/**
 * sumar numeros hasta que sumen 10000
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca números");
        double suma = 0;
        double num = 0;
        double contador = 0;
        double media = 0;
        while (suma <= 10000){
            System.out.print("> ");
            num = in.nextDouble();
            
            if (num > 10000){
                System.out.println("Por favor, introduzca un número menor de 10000");
            } else{
                suma += num;
                contador++;
            }
        }
        media = suma / contador;
        System.out.printf("Has introducido %5.0f números, sumando un ",contador);
        System.out.printf("total de %5.2f y dando de media %5.2f", suma, media);
    }
}