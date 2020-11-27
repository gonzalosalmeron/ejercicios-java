package ejercicios_bucles;

import java.util.Scanner;

/**
 * piramide con numeros
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = in.nextInt();
        
        int piso = 0;
        int espacios = altura - 1;
        int relleno = 1;
        int rellenoNumero = 1; 
        int mitad = 0;
        while (piso < altura){
            for (int i = 0; i < espacios; i++){
                System.out.print(" ");
            }
            for (int i = 0; i < relleno; i++){
                if (i < mitad){
                    System.out.print(rellenoNumero);
                    rellenoNumero++;
                } else{
                    System.out.print(rellenoNumero);
                    rellenoNumero--;
                }
            }
            System.out.println("");
            relleno += 2;
            espacios--;
            piso++;
            rellenoNumero = 1;
            mitad++;
        }
    }
}