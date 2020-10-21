/**
* 
*
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio03{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor introduzca la cantidad de pesetas a convertir");
    linea = System.console().readLine();
    double pesetas;
    pesetas = Integer.parseInt(linea);
    double euros;
    euros = pesetas * 0.006;
    System.out.println(pesetas + " pesetas son " + euros + " euros");
  }
}
    
