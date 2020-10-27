/**
* 
*Resolver ecuación de primer grado
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio05{
  public static void main(String[] args){
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    
    if (a == 0){
      System.out.println("No existe solución válida");
  } else{
      double x = -b / a;
      System.out.println("El resultado es: " + x);
    }
  }
}    
    
