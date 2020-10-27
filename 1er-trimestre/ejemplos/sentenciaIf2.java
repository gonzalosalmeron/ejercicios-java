/**
* 
*Sentencia if
* 
*
* @author Gonzalo Salmerón Robles
*/
public class sentenciaIf2{
  public static void main(String[] args){
    System.out.print("Por favor, introduce un número entero: ");
    int x = Integer.parseInt(System.console().readLine());
    
    if(x < 0){
      System.out.println("El número introducido es negativo.");
    } else{
      System.out.println("El número introducido es positivo.");
    }
  }
}
    
    
