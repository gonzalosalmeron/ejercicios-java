/**
* 
*Pirámide orientada
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio15{
  public static void main(String[] args){
    System.out.print("Por favor, introduzca el carácter con el que quiere");
    System.out.print(" hacer la prirámide: ");
    String x = System.console().readLine(); /* x es el carácter a introducir*/
    System.out.print("Por favor, indica la orientación de la pirámide: arriba,");
    System.out.print(" abajo, derecha o izquierda: ");
    String orientacion = System.console().readLine();
    switch(orientacion){
      case "arriba":
        System.out.println("   " + x);
        System.out.println("  " + x + x + x);
        System.out.println(" " + x + x + x + x + x );
        System.out.println(x + x + x + x + x + x + x);
      break;
      case "abajo":
        System.out.println(x + x + x + x + x + x + x);
        System.out.println(" " + x + x + x + x + x );
        System.out.println("  " + x + x + x);
        System.out.println("   " + x);
      break;
      case "derecha":
        System.out.println(x);
        System.out.println(x + x);
        System.out.println(x + x + x);
        System.out.println(x + x + x + x);
        System.out.println(x + x + x);
        System.out.println(x + x);
        System.out.println(x);
      break;
      case "izquierda":
        System.out.println("   " + x);
        System.out.println("  " + x + x);
        System.out.println(" " + x + x + x);
        System.out.println(x + x + x + x);
        System.out.println(" " + x + x + x);
        System.out.println("  " + x + x);
        System.out.println("   " + x);
      break;
      default:
        System.out.println("Orientación no válida");
    }
  }
}
