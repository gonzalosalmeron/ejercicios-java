/**
* 
*Calcular cuanto tarda en caer un objeto al suelo
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio06{
  public static void main(String[] args){
    System.out.println("Por favor introduzca la altura desde la que cae el objeto");
    int h = Integer.parseInt(System.console().readLine());
    double g = 9.81;
    double t = Math.sqrt(2 * h) / 2;
    System.out.println("Tardará " + t + "m/s2");
  }
}
