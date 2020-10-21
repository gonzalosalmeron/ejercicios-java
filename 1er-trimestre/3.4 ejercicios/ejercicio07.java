/**
* 
*Calcular base imposible
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio07{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la cantidad sin IVA");
    linea = System.console().readLine();
    double precioSinIva;
    precioSinIva = Integer.parseInt(linea);
    double precioConIva;
    precioConIva = precioSinIva * 1.21;
    System.out.println("El precio con IVA es de: " + precioConIva);
  }
}
