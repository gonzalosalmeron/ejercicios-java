package ejercicios_if_switch;

import java.util.Scanner;

/**
 * calcular precio total
 *
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = in.nextDouble();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIva = new Scanner(System.in).nextLine();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc0): ");
        String tipoPromo = new Scanner(System.in).nextLine();
        
        double IVA = 0;
        double precioConIva = 0;
        double total = 0;
        double promo = 0;
        double cantidadDescuento = 0;
        if(tipoIva.equals("general")){
            tipoIva = "21%";
            IVA = 0.21 * baseImponible;
            precioConIva = IVA + baseImponible;
        } else if (tipoIva.equals("reducido")){
            tipoIva = "10%";
            IVA = 0.1 * baseImponible;
            precioConIva = IVA + baseImponible;
        } else if (tipoIva.equals("superreducido")){
            tipoIva = "4%";
            IVA = 0.04 * baseImponible;
            precioConIva = IVA + baseImponible;
        }
        if (tipoPromo.equals("nopro")){
            tipoPromo = "nopro";
            cantidadDescuento = 0;
            total = precioConIva - cantidadDescuento;
        } else if (tipoPromo.equals("mitad")){
            tipoPromo = "mitad";
            cantidadDescuento = precioConIva / 2;
            total = precioConIva - cantidadDescuento;
        } else if (tipoPromo.equals("meno5")){
            tipoPromo = "meno5";
            cantidadDescuento = 5;
            total = precioConIva - cantidadDescuento;
        } else if (tipoPromo.equals("5porc")){
            tipoPromo = "5porc";
            cantidadDescuento = (precioConIva * 0.05);
            total = precioConIva - cantidadDescuento;
        }
        System.out.printf("Base imponible               %2.2f\n", baseImponible);
        System.out.printf("IVA (");
        System.out.print(tipoIva);
        System.out.printf(")                    %2.2f\n", IVA);
        System.out.printf("Precio con IVA               %2.2f\n", precioConIva);
        System.out.printf("Cód. promo. (");
        System.out.print(tipoPromo);
        System.out.printf(")         -%2.2f\n", cantidadDescuento);
        System.out.printf("TOTAL                        %2.2f", total);
    }
}


