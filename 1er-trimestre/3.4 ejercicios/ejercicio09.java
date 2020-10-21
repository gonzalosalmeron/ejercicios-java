/**
* 
*Calcula el volumen de un cono
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio09{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduza el radio del cono.");
    linea = System.console().readLine();
    int radio;
    radio = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca la altura del cono.");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea);
    double  volumen;
    volumen = 0.3333333333333333 * 3.14 * (radio * radio) * altura;
    System.out.println("El volumen del cono es: " + volumen);
  }
}
