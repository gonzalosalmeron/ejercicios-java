package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * pecera con pez dentro
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduce la altura de la pecera (como mínimo 4): ");
        int altura = in.nextInt();
        System.out.print("Ahora introduce la anchura (como mínimo 4): ");
        int anchura = in.nextInt();
        
        int contadorAltura = 1;
        int espaciosEnBlanco = anchura - 2;
        int contadorPared2 = 3;
        int contador = 0;
        int pescado = (int) (Math.random()*((altura - 2) * (anchura - 2)));
        System.out.println(pescado);
        while (contadorAltura <= altura){
            if (contadorAltura == 1 || contadorAltura == altura){
                System.out.println("");
                for (int i = 0; i < anchura; i++){
                    System.out.print("*");
                }
            } else{
                System.out.println("");
                
                for (int i = 0; i < 1; i++){
                    System.out.print("*");
                }
                for (int i = 0; i < espaciosEnBlanco; i++){
                    contadorPared2++;
                    contador++;
                    if (pescado == contador){
                        System.out.print("&");
                    } else {
                        System.out.print(" ");
                    }
                    if (contadorPared2 == anchura){
                    System.out.print("*");
                    }
                }
            }
            contadorAltura++;
            contadorPared2 = 2;
        }
    }
}