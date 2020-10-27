/**
* 
*Introduce un número y te diré que día de la semana que es
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio03{
  public static void main(String[] args){
    String dia;
    System.out.print("Introduce un número del 1 al 7: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    switch (numero) {
      case 1:
        dia = "lunes";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 2:
        dia = "martes";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 3:
        dia = "miércoles";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 4:
        dia = "jueves";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 5:
        dia = "viernes";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 6:
        dia = "sábado";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      case 7:
        dia = "domingo";
        System.out.println("El número " + numero + " equivale al día de la semana " + dia);
        break;
      default:
        dia = "Eso no es un número del 1 al 7";
        System.out.println("El número " + numero + " no está entre el 1 y el 7.");
    }
  }
}
