/**
* 
*Indica el día de la semana y diré que te toca a primera hora
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio01{
  public static void main(String[] args){
    String dia;
    System.out.print("Por favor, introduce el día de la semana: ");
    dia = System.console().readLine();
    switch(dia){
      case "lunes":
        System.out.println("El Lunes a primera hora hay ED");
      break;
      case "martes":
        System.out.println("El martes a primera hora hay Programación");
      break;
      case "miercoles":
        System.out.println("El miercoles a primera hora hay Programación");
      break;
      case "jueves":
        System.out.println("El Jueves a primera hora hay Programación");
      break;
      case "viernes":
        System.out.println("El Viernes a primera hora hay FOL");
      break;
      default:
        System.out.println("Día no válido");
    }
  }
}
    
