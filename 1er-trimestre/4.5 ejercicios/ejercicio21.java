package ejercicios_if_switch;

import java.util.Scanner;

/**
 * nota media de dos examenes
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota del primer examen: ");
        double nota1 = in.nextDouble();
        System.out.print("Por favor, introduzca la nota del segundo examen: ");
        double nota2 = in.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5){
            System.out.printf("Tu nota de programación es: %2.2f", media);
        } else{
            System.out.print("¿Cuál ha sido el resultado de la recuperacion?");
            System.out.print(" (apto/ no apto): ");
            String recuperacion = new Scanner(System.in).nextLine();
            if (recuperacion.equals("apto")){
                media = 5;
                System.out.printf("Tu nota de programación es: %2.2f", media);
            } else if(recuperacion.equals("no apto")){
                System.out.printf("Tu nota de programación es: %2.2f", media);
            }
        }
    }
}
