package ejercicios_if_switch;

import java.util.Scanner;

/**
 * horas restantes
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Por favor, introduce el día de la semana: ");
        String diaSemana = new Scanner(System.in).nextLine();
        System.out.println("Por favor, introduce una hora (ej. 20 48)");
        int hora = in.nextInt();
        int minutos = in.nextInt();
        
        int minutosTotales = (hora * 60) + minutos;
        int minutosRestantes = 0;
        int horasRestantes = 0;
        switch (diaSemana){
            case "lunes":
                minutosRestantes = 6600 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "martes":
                minutosRestantes = 5160 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "miercoles":
                minutosRestantes = 3720 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "jueves":
                minutosRestantes = 2280 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "viernes":
                minutosRestantes = 840 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "sabado":
                minutosRestantes = 9480 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            case "domingo":
                minutosRestantes = 8040 - minutosTotales;
                horasRestantes = minutosRestantes / 60;
                minutosRestantes = minutosRestantes % 60;
                System.out.print("Quedan " + horasRestantes + " horas y ");
                System.out.print(minutosRestantes + " minutos para el viernes");
                System.out.print(" a las 15:00.");
            break;
            default: 
                System.out.println("Día incorrecto");
        }
    }
}