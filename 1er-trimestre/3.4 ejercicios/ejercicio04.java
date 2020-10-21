/**
* 
*
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio04{
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
    
    double suma;
    double resta;
    double multiplicacion;
    double division;
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;
    
    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    System.out.println("El resultado de la division es: " + division);
  }
}
