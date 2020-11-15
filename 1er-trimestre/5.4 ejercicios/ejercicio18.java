package ejercicios_bucles;

import java.util.Scanner;

/**
 * Incrementar de 7 en 7 a partir de dos numeros introducidos
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca el primer número: ");
        int num1 = in.nextInt();
        System.out.print("Por favor, introduzca un segundo número distintinto");
        System.out.print(" del primero: ");
        int num2 = in.nextInt();
        while (num2 == num1){
            System.out.print("Por favor, introduzca el segundo número distinto");
            System.out.print(" del primero: ");
            num2 = in.nextInt();
        }
        int i = 0;
        int j = 0;
        if (num1 < num2){
            i = num1;
            j = num2;
        } else{
            i = num2;
            j = num1;
        }
        int resultado = i;
        while (i <= j){
            System.out.println(i + " ");
            i += 7;
            resultado = resultado + i;
            
        }
    }
}