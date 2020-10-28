/**
* 
*Pirámide orientada
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio15{
  public static void main(String[] args){
    System.out.println("Por favor, indica la orientación de la pirámide: arriba, abajo, derecha o izquierda");
    String orientacion = System.console().readLine();
    switch(orientacion){
      case "arriba":
        System.out.println("   +");
        System.out.println("  +++");
        System.out.println(" +++++");
        System.out.println("+++++++");
      break;
      case "abajo":
        System.out.println("+++++++");
        System.out.println(" +++++");
        System.out.println("  +++");
        System.out.println("   +");
      break;
      case "derecha":
        System.out.println("+");
        System.out.println("++");
        System.out.println("+++");
        System.out.println("++++");
        System.out.println("+++");
        System.out.println("++");
        System.out.println("+");
      break;
      case "izquierda":
        System.out.println("   *");
        System.out.println("  **");
        System.out.println(" ***");
        System.out.println("****");
        System.out.println(" ***");
        System.out.println("  **");
        System.out.println("   *");
      break;
      default:
        System.out.println("Orientación no válida");
    }
  }
}
