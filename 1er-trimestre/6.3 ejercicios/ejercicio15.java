package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * generador de melodía al azar
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numNota = 0;
        String nota = "";
        int cantidadNotas = 0;
        boolean multiploSiNo = false;
        
        while (!multiploSiNo){
            cantidadNotas = (int) (Math.random()*11 + 4) * 2;
            if ((cantidadNotas % 4) == 0){
                multiploSiNo = true;
            }
        }
        for (int i = 1; i <= cantidadNotas; i++){
            numNota = (int) (Math.random()*7);
            switch (numNota){
                case 0:
                    nota = "do";
                    break;
                case 1:
                    nota = "re";
                    break;
                case 2:
                    nota = "mi";
                    break;
                case 3:
                    nota = "fa";
                    break;
                case 4:
                    nota = "sol";
                    break;
                case 5:
                    nota = "la";
                    break;
                case 6:
                    nota = "si";
                default:
            }
            System.out.print (nota + " ");
            if (i < cantidadNotas && (i % 4 == 0)){
                System.out.print("| ");
            } else if (i == cantidadNotas){
                System.out.print("||");
            }
        }
    }
}
