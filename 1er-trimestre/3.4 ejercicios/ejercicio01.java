/**
* 
*
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio01{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca un primer número");
    linea = System.console().readLine();
    double num1;
    num1 = Integer.parseInt(linea);
    
    System.out.println("Por favor, introduzca un primer número");
    linea = System.console().readLine();
    double num2;
    num2 = Integer.parseInt(linea);

    double multiplicacion;
    multiplicacion = num1 * num2;

    System.out.println("El resultado de la multiplicación es: " + multiplicacion);

  }
}
