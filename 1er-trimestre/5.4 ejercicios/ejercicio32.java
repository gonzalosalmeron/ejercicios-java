package ejercicios_bucles;

import java.util.Scanner;

/**
 * mostrar número del revés
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        long numIntroducido = in.nextLong();
        
        System.out.println(numIntroducido);
        long numVolteado = 0;
        while (numIntroducido > 0){
            numVolteado = ((numIntroducido % 10) + numVolteado) * 10;
            numIntroducido /= 10;
        }
        numVolteado /= 10;
        
        System.out.print("Dígitos pares: ");
        double comprobacion = 0;
        double ultimaCifra = 0;
        while (numVolteado > 0){
            ultimaCifra = numVolteado % 10;
            comprobacion = ultimaCifra % 2;
            numVolteado /= 10;
            if (comprobacion == 0){
                System.out.printf("%1.0f ", ultimaCifra);
            }
        }
    }
}
