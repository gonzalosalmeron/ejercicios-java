package ejercicios_bucles;

import java.util.Scanner;

/**
 * pintar una pirámide
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio19_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = in.nextInt();
        System.out.print("Introduzca el caracter de relleno: ");
        String relleno = new Scanner(System.in).nextLine();
        
        int piso = 1;
        int espacio = altura -1;
        int linea = 0;
        while (piso <= altura){
            for (int i = 0; i < espacio; i++){
                System.out.print(" ");
            }
            for (int i = 0; i <= linea; i++){
                System.out.print(relleno);
            }
            System.out.println("");
            piso++;
            espacio--;
            linea += 2;
        }
    }
}
