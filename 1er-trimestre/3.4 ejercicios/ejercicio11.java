/**
* 
*Realiza un conversor de kb a mb
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio11{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la cantidad de Mb a convertir: ");
    linea = System.console().readLine();
    int kb;
    kb = Integer.parseInt(linea);
    int mb;
    mb = kb / 1024;
    System.out.println(kb + " Kb son " + mb + " Mb");
  }
}
