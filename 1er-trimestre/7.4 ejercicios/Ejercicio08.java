package ejercicios_bucles;

import java.util.Scanner;

/**
 * pedir temperatura media y hacer gráfico
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] temperatura = new int[12];
        for (int i = 0; i < temperatura.length; i++){
            System.out.print("Introduzca la temperatura media del mes ");
            System.out.print((i + 1) + ": ");
            temperatura[i] = in.nextInt();
        }
        int contador = 0;
        while (contador < 12){
            System.out.print("Mes " + (contador + 1) + " |");
            for (int i = 0; i < temperatura[contador]; i++){
                System.out.print("*");
            }
            System.out.println("");
            contador++;
        }
    }
}
