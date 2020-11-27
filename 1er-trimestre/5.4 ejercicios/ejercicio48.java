package ejercicios_bucles;

import java.util.Scanner;

/**
 * mostrar número del revés
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        long num = in.nextLong();
        
        boolean comprobacion;
        int comprobacionNum = 0;
        long copiaNum = num;
        System.out.print("Dígitos que aparecen en el número: ");
        for (int i = 0; i < 10; i++ ){
            comprobacionNum = (int) (copiaNum % 10);
            while (copiaNum > 0){
                if (i == comprobacionNum){
                System.out.print(i);
                }
                copiaNum /= 10;
            }
        }
        System.out.println("");
        System.out.print("Dígitos que no aparecen: ");
        for (int i = 0; i < 10; i++){
            comprobacionNum = (int) (num % 10);
            while (num > 0){
                if (i != comprobacionNum){
                System.out.print(i);
                }
                num /= 10;
            }
        }
    }
}