package ejercicios_bucles;

import java.util.Scanner;

/**
 * pintar una pirámide hueca
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio20_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = in.nextInt();
        System.out.print("Introduzca el caracter de relleno: ");
        String relleno = new Scanner(System.in).nextLine();
        
        int piso = 1;
        int espacio = altura -1;
        int linea = 0;
        int espacioEnBlanco = 0;
        int ultimaLinea = 1;
        int contador = 0;
        while (piso <= altura){
            for (int i = 0; i < espacio; i++){
                System.out.print(" ");
            }
            if (piso == altura){
                while (contador != ultimaLinea){
                    System.out.print(relleno);
                    contador++;
                }
            } else{
                for (int i = 0; i <= linea; i++){
                System.out.print(relleno);
                }
                for (int i = 1; i <= espacioEnBlanco; i++){
                    System.out.print(" ");
                }
                if (piso == 1){
                    System.out.print("");
                } else {
                    System.out.print(relleno);
                    espacioEnBlanco++;
                }
            }
            
            System.out.println("");
            piso++;
            espacio--;
            espacioEnBlanco++;
            ultimaLinea += 2;
        }
    }
}
