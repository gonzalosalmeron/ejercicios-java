package ejercicios_bucles;

import java.util.Scanner;

/**
 * pintar una pirámide
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la pirámide");
        int altura = in.nextInt();
        System.out.println("Por favor, introduzca el caracter de relleno");
        String relleno = new Scanner(System.in).nextLine();
        int longitudLinea = 2;
        int espacios = altura - 1;
        int planta = 1;
        
        while (planta <= altura){
           for (int i = 1; i <= espacios; i++){
               System.out.print(" ");
           }
           for (int i = 1; i < longitudLinea; i++){
               System.out.print(relleno);
           }
           espacios -= 1;
           longitudLinea += 2;
           planta++;
           System.out.println(" ");
        }
    }
}