/**
* 
*Ecuación de segundo grado
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio09{
  public static void main(String[] args){
    System.out.print("Por favor, introduzca un valor para a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca un valor para b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca un valor para c: ");
    int c = Integer.parseInt(System.console().readLine());
    
    double raizS = (b * b) - (4 * a * c);
    
    if(a == 0 || raizS < 0){
      System.out.println("Lo siento, no tiene solucción real");
    } else{
      double raizR = Math.sqrt(raizS);
      double solu1 = (-b + raizR) / (2 * a);
      double solu2 = (-b - raizR) / (2 * a);
      System.out.print("La solucción de x1 es: %.2f", solu1);
      System.out.print("La solucción de x2 es: %.2f", solu2);
    }
  }
}
