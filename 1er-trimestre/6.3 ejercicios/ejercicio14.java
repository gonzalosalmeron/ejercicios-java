package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * el programa adivina el numero que pensamos entre 0 y 100
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean haAcertado = false;
        int maximo = 100;
        int minimo = 0;
        String mayorMenor = "";
        int contador = 5;
        int num = 0;
        
        while (!haAcertado && (contador > 0)){
            contador++;
            num = (int) (Math.random()*(maximo-minimo)) + (minimo);
            System.out.println(num);
            System.out.println("He acertado el número? (si, no)");
            String siNo = new Scanner(System.in).nextLine();
            
            if (siNo.equals("si")){
                System.out.println("Soy un crack jejejjejeje");
                haAcertado = true;
            } else if (siNo.equals("no")){
                System.out.println("el número es mayor o menor?");
                mayorMenor = new Scanner(System.in).nextLine();
                if (mayorMenor.equals("mayor")){
                    minimo = num + 1;
                } else if (mayorMenor.equals("menor")){
                    maximo = num - 1;
                }
            }
        }
    }
}

