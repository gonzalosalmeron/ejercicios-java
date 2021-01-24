package ejercicios_bucles;

import java.util.Scanner;

/**
 * array de 12 números
 *
 * @author Gonzalo Salmerón Robles
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char[] caracter = new char[13];
        
        caracter[0] = 'R';
        caracter[1] = 'G';
        caracter[2] = '3';
        caracter[3] = ' ';
        caracter[4] = '6';
        caracter[5] = 'P';
        caracter[6] = ' ';
        caracter[7] = 'U';
        caracter[8] = 'F';
        caracter[9] = ' ';
        caracter[10] = '3';
        caracter[11] = '1';
        caracter[12] = ' ';
        
        for (int i = 0; i < 13; i++){
            System.out.print(caracter[i] + " ");
        }
    }
}
