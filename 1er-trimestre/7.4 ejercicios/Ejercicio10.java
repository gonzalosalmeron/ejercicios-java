package ejercicios_array;

import java.util.Scanner;

/**
 * mostrar primero numeros primos y luego el resto
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio10 {
    private static char[] i;

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[10];
        int[] listaPrimos = new int[10];
        int[] listaNoPrimo = new int[10];
        int comprobacionPrimo = 0;
        int primo = 0;
        int noPrimo = 0;
        int contador = 0;
        
        for (int i = 0; i < num.length; i++) {
        	System.out.print("Introduzca el número " + (i + 1) + ": ");
			num[i] = in.nextInt();
			
			for (int j = 1; j <= num[i]; j++) {
				comprobacionPrimo = num[i] % j;
				if (comprobacionPrimo == 0) {
					contador++;
				}
			}
			if (contador < 3) {
				listaPrimos[primo++] = num[i];
			} else {
				listaNoPrimo[noPrimo++] = num[i];
			}
			contador = 0;
        }
        
        for (int i = 0; i < primo; i++) {
        	num[i] = listaPrimos[i];
        }
        for (int i = primo; i < primo + noPrimo; i++) {
        	num[i] = listaNoPrimo[i - primo];
        }
        
        for (int lista : num) {
        	System.out.println(lista);
        }
    }
}