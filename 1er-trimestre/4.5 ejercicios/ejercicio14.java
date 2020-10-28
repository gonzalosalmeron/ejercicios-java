/**
* 
*Decir si es par o impar y divisible entre 5
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio14{
  public static void main(String[] args){
    System.out.print("Por favor, introduce un número: ");
    int x = Integer.parseInt(System.console().readLine());
    double resto = (x % 2);
    double divisible = (x % 5);
    
    if(resto != 0 && divisible != 0){
      System.out.println("El número no es par ni divisible entre 5");
    } else if(resto == 0 && divisible == 0){
      System.out.println("El número es par y divisible entre 5");
    } else if(resto != 0 && divisible == 0){
      System.out.println("El número es impar y divisible entre 5");
    } else{
      System.out.println("El número es par pero no divisible entre 5");
    }
  }
}
