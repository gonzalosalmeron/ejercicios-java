package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * diez lineas formadas por caracteres
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caracterNum = 0;
        String caracter = "";
        
        caracterNum = (int) (Math.random()*6);
        switch (caracterNum){
            case 0:
                caracter = "*";
                break;
            case 1:
                caracter = "-";
                break;
            case 2:
                caracter = "=";
                break;
            case 3:
                caracter = ".";
                break;
            case 4:
                caracter = "|";
                break;
            case 5:
                caracter = "@";
                break;
            default:
                String.valueOf(caracterNum);
        }
        int longitud = 0;
        longitud = (int) (Math.random()*40 + 1);
        for (int i = 0; i < longitud; i++){
            System.out.print(caracter);
        }
    }
}
