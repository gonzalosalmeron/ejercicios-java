package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * carta aleatoria
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCarta = (int) (Math.random()*10 + 1);
        String carta = "";
        switch (numeroCarta){
            case 1:
                carta = "as";
                break;
            case 8:
                carta = "sota";
                break;
            case 9:
                carta = "caballo";
                break;
            case 10:
                carta = "rey";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        int numeroPalo = (int) (Math.random()*3);
        String palo = "";
        switch (numeroPalo){
            case 0:
                palo = "oros";
                break;
            case 1:
                palo = "bastos";
                break;
            case 2:
                palo = "espadas";
                break;
            case 3:
                palo = "copas";
                break;
            default:
        }
        System.out.println(carta + " de " + palo);
    }
}