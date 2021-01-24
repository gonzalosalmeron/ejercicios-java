package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * simulador máquina tragaperras simplificada
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int figuraNum = 0;
        String figura = "";
        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;
        
        for (int i = 0; i < 3; i++){
            figuraNum = (int) (Math.random()*5);
            switch (figuraNum){
                case 0:
                    figura = "corazón";
                    break;
                case 1:
                    figura = "diamante";
                    break;
                case 2:
                    figura = "herradura";
                    break;
                case 3:
                    figura = "campana";
                    break;
                case 4:
                    figura = "limón";
                    break;
                default:
            }
            System.out.print(figura + " ");
            if (i == 0){
                figura1 = figuraNum;
            } else if (i == 1){
                figura2 = figuraNum;
            } else {
                figura3 = figuraNum;
            }
        }
        if ((figura1 == figura2) && (figura1 == figura3)){
            System.out.println("\nEnhorabuena, ha ganado 10 monedas");
        } else if ((figura1 == figura2) || (figura1 == figura3) || (figura2 == figura3)){
            System.out.println("\nBien, ha recuperado su moneda");
        } else{
            System.out.println("\nLo siento, ha perdido");
        }
    }
}
