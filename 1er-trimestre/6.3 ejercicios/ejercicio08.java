package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * 3 apuestas de la quiniela
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int colum = 0;
        int contador = 0;
        String columt = "";
        int multiplo = 0;
        int contadorIntro = 0;
        int contadorColumna = 1;
        while (contador < 43){
            for (int i = 0; i < 43; i++){
            colum = (int) (Math.random()*6);
            }
            switch (colum){
                case 0:
                    columt = "1";
                    break;
                case 1:
                    columt = "1";
                    break;
                case 2:
                    columt = "1";
                    break;
                case 3:
                    columt = "x";
                    break;
                case 4:
                    columt = "x";
                    break;
                case 5:
                    columt = "2";
                    break;
                default:
            }
            if (contadorIntro == 0 && contador < 42){
                System.out.print("Columa " + contadorColumna);
                contadorColumna++;
            }
            if (contador < 42){
                System.out.print(" | ");
                System.out.print(columt + " | ");
            } else {
                System.out.println("Pleno al 15: " + columt);
            }
            contadorIntro++;
            if (contadorIntro == 3){
                System.out.println("");
                contadorIntro = 0;
            }
            contador++;         
        }
    }
}
