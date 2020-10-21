/**
* 
*
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio02{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor introduzca la cantidad de euros a convertir");
    linea = System.console().readLine();
    double euros;
    euros = Integer.parseInt(linea);
    double pesetas;
    pesetas = euros * 166.386;
    System.out.println(euros + " euros son " + pesetas + " pesetas");
  }
}
    
