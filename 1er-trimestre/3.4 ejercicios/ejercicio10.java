/**
* 
*Realiza un conversor de mb a kb
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio10{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la cantidad de Mb a convertir: ");
    linea = System.console().readLine();
    int mb;
    mb = Integer.parseInt(linea);
    int kb;
    kb = mb * 1024;
    System.out.println(mb + " Mb son " + kb + " Kb");
  }
}
    
