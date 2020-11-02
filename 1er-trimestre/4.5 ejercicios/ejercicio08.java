/**
* 
*Media de 3 notas, insuficiente, suficiente, bien, notable, sobresaliente
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio08{
  public static void main(String[] args){
    System.out.print("Por favor, introduzca la primera nota: ");
    double a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la segunda nota: ");
    double b = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la tercera nota: ");
    double c = Integer.parseInt(System.console().readLine());
    double media = (a + b + c) / 3;
    if(a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10){
      System.out.println("Notas no válidas");
  } else if(media < 5){
    System.out.printf("Lo siento, %.2f es un insuficiente" , media);
  } else if(media >= 5 && media <= 6){
    System.out.printf("Podría haber sido mejor, %.2f es un bien", media);
  } else if(media < 9){
    System.out.printf("Está bien, %.2f es un notable.", media);
  } else{
    System.out.printf("Enhorabuena!! Un %.2f es un sobresaliente.", media);
    } 
  }
}
