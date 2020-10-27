/**
* 
*Media de 3 notas
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio07{
  public static void main(String[] args){
    System.out.print("Por favor, introduzca la primera nota: ");
    double a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double b = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota: ");
    double c = Integer.parseInt(System.console().readLine());
    double media = (a + b + c) / 3;
    if(a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10){
      System.out.println("Notas no válidas");
  } else{
    System.out.printf("La media de las tres notas es de %.0f" , media);
    } 
  }
}
