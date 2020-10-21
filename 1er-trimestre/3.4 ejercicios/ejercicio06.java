/**
* 
*Calcula el área de un trilángulo
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio06{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la base del triángulo");
    linea = System.console().readLine();
    double base;
    base = Interger.parseInt(linea);
    System.out.println("Por favor, introduzca la altura del triángulo");
    linea = System.console().readLine();
    double altura;
    altura = Interger.parseInt(linea);
    area = (base * altura) / 2;
    System.out.println("El area del triangulo es: " + area);
  }
}
