package ejercicios_num_aleatorios;

import java.util.Scanner;

/**
 * 20 notas impresas por pantalla
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantidadNota = 0;
        int cantidadSuspensos = 0;
        int cantidadSuficientes = 0;
        int cantidadBienes = 0;
        int cantidadNotables = 0;
        int cantidadSobresalientes = 0;
        String nota = "";
        for (int i = 0; i < 20; i++){
            cantidadNota = (int) (Math.random()*10 + 1);
            switch (cantidadNota){
                case 1:
                    nota = "suspenso";
                    cantidadSuspensos++;
                    break;
                case 2:
                    nota = "suspenso";
                    cantidadSuspensos++;
                    break;
                case 3:
                    nota = "suspenso";
                    cantidadSuspensos++;
                    break;
                case 4:
                    nota = "suspenso";
                    cantidadSuspensos++;
                    break;
                case 5:
                    nota = "suficiente";
                    cantidadSuficientes++;
                    break;
                case 6:
                    nota = "bien";
                    cantidadBienes++;
                    break;
                case 7:
                    nota = "notable";
                    cantidadNotables++;
                    break;
                case 8:
                    nota = "notable";
                    cantidadNotables++;
                case 9:
                    nota = "sobresaliente";
                    cantidadSobresalientes++;
                case 10:
                    nota = "sobresaliente";
                    cantidadSobresalientes++;
                    break;
                default:
                    String.valueOf(cantidadNota);
            }
            System.out.println(nota);
        }
        System.out.print("Hay " + cantidadSuspensos + " suspensos, ");
        System.out.print(cantidadSuficientes + " suficientes, " + cantidadBienes);
        System.out.print(" bienes, " + cantidadNotables + " notables, ");
        System.out.print(" y " + cantidadSobresalientes + " sobresalientes.");
    }
}
