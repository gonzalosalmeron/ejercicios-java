/**
* 
*Ordenar 3 números de mayor a menor
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio13{
  public static void main(String[] args){
    System.out.print("Por favor, introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if(num1 >= num2 && num1 >= num3 && num2 >= num3){
      System.out.println(num1 + ", " + num2 + ", " + num3);
    } else if(num2 >= num1 && num2 >= num3 && num1 >= num3){
      System.out.println(num2 + ", " + num1 + ", " + num3);
    } else if(num2 >= num1 && num2 >= num3 && num3 >= num1){
      System.out.println(num2 + ", " + num3 + ", " + num1);
    } else if(num3 >= num1 && num3 >= num2 && num2 >= num1){
      System.out.println(num3 + ", " + num2 + ", " + num1);
    } else{
      System.out.println(num1 + ", " + num3 + ", " + num2);
    }
  }
}
