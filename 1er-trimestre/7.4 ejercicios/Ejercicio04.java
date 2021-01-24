package ejercicios_bucles;

import java.util.Scanner;

/**
 * 3 arrays de numeros aleatorios con su cuadrado y cubo en columnas
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        
        for (int i = 0; i < 20; i++){
            num[i] = (int) (Math.random()*101);
            cuadrado[i] = num[i] * num[i];
            cubo[i] = cuadrado[i] * num[i];
        }
        for (int i = 0; i < 20; i++){
            System.out.printf("%9d | %9d | %9d\n", num[i], cuadrado[i], cubo[i]);
        }
    }
}
