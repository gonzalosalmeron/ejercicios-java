/**
* 
*Realiza un conversor de mb a kb
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio12{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca la nota del primer examen: ");
    linea = System.console().readLine();
    double nota1;
    nota1 = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca la nota deseada: ");
    linea = System.console().readLine();
    double notaDeseada;
    notaDeseada = Integer.parseInt(linea);
    double notaNecesaria;
    notaNecesaria = (( notaDeseada )-( nota1 * 0.4))/0.6;
    System.out.println("La nota necesaria es: " + notaNecesaria);
  }
}
