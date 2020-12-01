package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * carta aleatoria
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCarta = (int)(Math.random()*13 + 1);
        String carta = "";
        switch (numeroCarta){
            case 1:
                carta = "As";
                    break;
            case 11: 
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        
        int numeroPalo = (int)(Math.random()*3);
        String palo = "";
        switch(numeroPalo){
            case 0:
                palo = "picas";
                break;
            case 1:
                palo = "corazones";
                break;
            case 2:
                palo = "diamantes";
                break;
            case 3:
                palo = "tréboles";
                break;
            default:
        }
        System.out.println(carta + " de " + palo);
    }
}
