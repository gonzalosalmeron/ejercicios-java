package ejercicios_array;

import java.util.Scanner;

/**
 * mostrar primero pares y luego impares
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[10];
        int[] resultado = new int [10];
        System.out.print("Por favor, introduzca 10 números separados por la tecla intro: ");
        for (int i = 0; i < num.length; i++) {
        	num[i] = in.nextInt();
        }
        System.out.print("Indice: ");
        for (int i = 0; i < num.length; i++) {
        	System.out.print(i + " ");
        }
        System.out.print("\nValor: ");
        for (int i = 0; i < num.length; i++) {
        	System.out.print(num[i] + " ");
        }
        int inicial = 0;
        int ultimo = 0;
        do {
        	System.out.println("\nIntroduzca una posición inicial y otra final separadas por espacios");
            System.out.print("(la inicial debe ser menor que la final): ");
            inicial = in.nextInt();
            ultimo = in.nextInt();
		} while (inicial >= ultimo || inicial < 0 || inicial > 9 || ultimo < 0 || ultimo > 9);
        for (int i = 0; i < num.length; i++) {
			resultado[i] = num[i];
		}
        resultado[ultimo] = resultado [inicial];
        
        for (int i = ultimo + 1; i < num.length; i++) {
        	resultado[i] = num[i - 1];
        }
        resultado[0] = num[9];
        for (int i = 0; i < inicial; i++) {
        	resultado[i + 1] = num[i];
        }
        System.out.print("\nIndice: ");
        for (int i = 0; i < num.length; i++) {
        	System.out.print(i + " ");
        }
        System.out.print("\nValor: ");
        for (int i = 0; i < num.length;i++) {
        	System.out.print(resultado[i] + " ");
        }
    }
}