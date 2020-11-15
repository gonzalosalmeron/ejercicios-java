package ejercicios_bucles;

import java.util.Scanner;

/**
 * pintar una pirámide hueca
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la pirámide");
        int altura = in.nextInt();
        System.out.println("Por favor, introduzca el caracter de relleno");
        String relleno = new Scanner(System.in).nextLine();
        int pisos = 1;
        int espaciosDelante = altura - 1;
        int longitud = 1;
        int espaciosInternos = 0;
        while (pisos <= altura){
            for (int i = 1; i <= espaciosDelante; i++){
                System.out.print(" ");
            }
            System.out.print(relleno);
            for (int i = 1; i <= espaciosInternos; i++){
                System.out.print(" ");
            }
            if (pisos > 1){
                System.out.print(relleno);
            }
            System.out.println("");
            pisos++;
            espaciosDelante -= 1;
            longitud += 2;
            espaciosInternos++;
            if (pisos > 2){
               espaciosInternos++; 
            }
        }
        for (int i = 1; i < altura * 2;i++){
                System.out.print(relleno);
        }
    }
}