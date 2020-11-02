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
    if(x < 100){
      int cifra = x % 10;
      System.out.println("La última cifra del número introducido es: " + cifra);
    } else{
      System.out.println("Lo siento, el número puede tener hasta dos cifras.");
    }
  }
}
    
