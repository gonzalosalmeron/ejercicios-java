package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * caracteres aleatorios impresos por pantalla
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caracter = 0;
        int contador = 0;
        while (contador < 30000){
            caracter = (int)(Math.random()*94 + 32);
            char caracterNombre = (char)caracter;
            System.out.println(caracterNombre);
        }
    }
}
