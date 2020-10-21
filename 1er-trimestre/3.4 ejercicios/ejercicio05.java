/**
* 
*Calcula el área de un rectángulo
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio05{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la base del rectángulo");
    linea = System.console().readLine();
    double base;
    base = Integer.parseInt(linea);
    
    System.out.println("Por favor, introduzca la altura del rectángulo");
    linea = System.console().readLine();
    double altura;
    altura = Integer.parseInt(linea);
    double area;
    area = base * altura;
    System.out.println("El área del rectángulo es de: " + area);
  }
}
    
