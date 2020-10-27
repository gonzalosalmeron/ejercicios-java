/**
* 
*Indica la hora y te saludaré
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio02{
  public static void main(String[] args){
    System.out.print("Introduce una hora (formato 24h):");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.print("Buenos días.");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.print("Buenas tardes.");
    }
    
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches.");
    }
    
    if ((hora < 0) || (hora >= 24)) {
      System.out.print("La hora introducida no es correcta.");
    }
  }
}
