/**
* 
*Decir última cifra de num introducido
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio17{
  public static void main(String[] args){
    System.out.print("Por favor introduce un número: ");
    int x = Integer.parseInt(System.console().readLine());
    int cifra = x % 10;
    System.out.println(cifra);
  }
}
    
