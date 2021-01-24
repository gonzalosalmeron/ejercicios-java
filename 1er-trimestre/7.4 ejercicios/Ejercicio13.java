package ejercicios_array;

import java.util.Scanner;

/**
 * mostrar entre asteriscos el menor o el mayor
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[100];
        int mayor = 0;
        for (int i = 0; i < num.length; i++) {
        	num[i] = (int) (Math.random()*501);
        	if (num[i] > mayor) {
        		mayor = num[i];
        	}
        }
        int menor = mayor;
        for (int i : num) {
			if (i < menor) {
				menor = i;
			}
		System.out.print(i + " ");
		}
        int destacar = 0;
        while (destacar < 1 || destacar > 2) {
        	System.out.print("\n¿Qué es lo que quiere destacar? (mayor -> 1 || menor -> 2): ");
            destacar = in.nextInt();
        }
        
        if (destacar == 1) {
        	destacar = mayor;
        } else {
        	destacar = menor;
        }
        for (int i : num) {
			if (destacar == i) {
				System.out.print("**" + i + "**" + " ");
			} else {
				System.out.print(i + " ");
			}
		}
    }
}