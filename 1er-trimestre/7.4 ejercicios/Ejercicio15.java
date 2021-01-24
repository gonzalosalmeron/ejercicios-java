package ejercicios_array;

import java.util.*;

/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes.
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


		int[] mesa = new int[10];
		int[] ocupacion = new int[10];
		
		for (int i = 0; i < mesa.length; i++) {
			mesa[i] = i + 1;
			ocupacion[i] = (int) (Math.random()*5);
		}
		int personas = 0;
		System.out.println("╔═════════════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╗");
		System.out.print("║ Mesa nº     ║");
		for (int j = 0; j < mesa.length; j++) {
			System.out.printf("   %2d  ║", mesa[j]);
		}
		System.out.println("\n╠═════════════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╣");
		System.out.print("║ Ocupación   ║");
		for (int j = 0; j < ocupacion.length; j++) {
			System.out.printf("   %2d  ║", ocupacion[j]);
		}
		System.out.println("\n╚═════════════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╝");
		while (personas != -1) {
			System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
			personas = in.nextInt();
			if (personas > 4) {
				System.out.println("Lo siento, no admitimos grupos de " + personas + ", haga grupos de 4 personas como máximo e intente de nuevo.");
			} else {
				boolean comprobador = false;
				boolean comprobador2 = false;
				for (int i = 0; i < ocupacion.length; i++) {
					if (ocupacion[i] == 0) {
						System.out.println("Por favor, siéntese en la mesa número " + mesa[i] + ".");
						ocupacion[i] = personas;
						i = ocupacion.length;
						comprobador = true;
					}
				}
				if (comprobador != true) {
					for (int i = 0; i < ocupacion.length; i++) {
						int total = personas + ocupacion[i];
						if (total < 5) {
							System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa número " + mesa[i] + ".");
							ocupacion[i] = total;
							i = ocupacion.length;
							comprobador2 = false;
						} else {
							comprobador2 = true;
						}
					}
				}
				if (comprobador2) {
					System.out.println("No hay sitio");
				}
			}
			System.out.println("╔═════════════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╦═══════╗");
			System.out.print("║ Mesa nº     ║");
			for (int j = 0; j < mesa.length; j++) {
				System.out.printf("   %2d  ║", mesa[j]);
			}
			System.out.println("\n╠═════════════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╬═══════╣");
			System.out.print("║ Ocupación   ║");
			for (int j = 0; j < ocupacion.length; j++) {
				System.out.printf("   %2d  ║", ocupacion[j]);
			}
			System.out.println("\n╚═════════════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╩═══════╝");
		}
	}
}