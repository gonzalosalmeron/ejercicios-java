package ejercicios_if_switch;

import java.util.Scanner;

/**
 * generador de nómina
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sueldo = 0;
        int cargo = 0;
        while (cargo < 1 || cargo > 3){
            System.out.println("1 - Programador junior");
            System.out.println("2 - Prog. senior");
            System.out.println("3 - Jefe de proyecto");
            System.out.print("Introduzca el cargo del empleado (1 - 3): ");
            cargo = in.nextInt();
            switch (cargo){
            case 1:
                sueldo = 960;
            break;
            case 2:
                sueldo = 1200;
            break;
            case 3:
                sueldo = 1600;
            break;
            default:
                System.out.println("Cargo incorrecto");
            }
        }
        
        double diasVisitas = -1;
        double viajes = 0;
        while (diasVisitas < 0){
            System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
            diasVisitas = in.nextInt();
            viajes = diasVisitas * 30;
        }
        double sueldoBruto = sueldo + diasVisitas;
        int estadoCivil = 0;
        double retencionIRPF = 0;
        double IRPF = 0;
        while (estadoCivil < 1 || estadoCivil > 2){
            System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
            estadoCivil = in.nextInt();
            switch (estadoCivil){
                case 1: 
                    retencionIRPF = sueldoBruto * 0.25;
                    IRPF = 25;
                break;
                case 2:
                    retencionIRPF = sueldoBruto * 0.20;
                    IRPF = 20;
                break;
                default:
                    System.out.println("Estado Civil no válido");
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("| Sueldo base                            %4.2f| \n", sueldo);
        System.out.printf("| Dietas (%3.0f viajes)                      %4.2f|\n", diasVisitas, viajes);
        System.out.println("-------------------------------------------------");
        System.out.printf("| Sueldo bruto                           %4.2f|\n", sueldoBruto);
        System.out.printf("| Retención IRPF ( %2.0f%% )                  %4.2f|\n", IRPF, retencionIRPF);
        System.out.println("-------------------------------------------------");
        System.out.printf("| Sueldo neto                            %4.2f|\n", sueldoBruto - retencionIRPF);
        System.out.println("-------------------------------------------------");
        
    }
}
