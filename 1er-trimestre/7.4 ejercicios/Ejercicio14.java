
package ejercicios_array;

import java.util.Scanner;

/**
 * si es un color, posicionar el primero
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] teclado = new String[8];
        String[] resultado = new String[8];
        String[] colores = new String[9];
        
        colores[0] = "verde";
        colores[1] = "rojo";
        colores[2] = "azul";
        colores[3] = "amarillo";
        colores[4] = "naranja";
        colores[5] = "rosa";
        colores[6] = "negro";
        colores[7] = "blanco";
        colores[8] = "morado";

        int contador = 0;
		
        System.out.println("Introduce 8 palabras: ");
        for (int i = 0; i < teclado.length; i++) {
        	System.out.print("> ");
        	teclado[i] = new Scanner(System.in).nextLine();
        }
        for (int i = 0; i < teclado.length; i++) {
        	for (int j = 0; j < colores.length; j++) {
        		if (teclado[i].equals(colores[j])) {
        			resultado[contador++] = teclado[i];
        		}
        	}
        }
        
        boolean comprobacion = false;
        for (int i = 0; i < teclado.length; i++) {
        	for (int j = 0; j < colores.length; j++) {
        		if (teclado[i].equals(colores[j])) {
        			comprobacion = true;
        			j = colores.length;
        		}
        	}
        	if (comprobacion == false) {
    			resultado[contador++] = teclado[i];
    		}
        	comprobacion = false;
        }
        System.out.println("\nArray original:");
					
        System.out.println("\nArray original:");
        System.out.println("╔═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╗");
        for (int i = 0; i < teclado.length; i++) {
        	System.out.printf("║        %-9d  ", i);
        }
        System.out.println("║");
		System.out.println("╠═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╣");
		for (int i = 0; i < teclado.length; i++) {
        	System.out.printf("║      %-9s    ", teclado[i]);
        }
        System.out.println("║");
		System.out.println("╚═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╝");
		
		System.out.println("\nArray resultado:");
        System.out.println("╔═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╦═══════════════════╗");
        for (int i = 0; i < teclado.length; i++) {
        	System.out.printf("║        %-9d  ", i);
        }
        System.out.println("║");
		System.out.println("╠═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╬═══════════════════╣");
		for (int i = 0; i < teclado.length; i++) {
        	System.out.printf("║      %-9s    ", resultado[i]);
        }
        System.out.println("║");
		System.out.println("╚═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╩═══════════════════╝");
		
    }
}