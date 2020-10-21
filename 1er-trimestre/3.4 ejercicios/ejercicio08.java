/**
* 
*Calcula el dinero correspondiente a lo largo de una semana. 12 euros la hora.
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio08{
  public static void main(String[] args){
    String linea;
    System.out.println("Por favor, introduzca las horas trabajadas el Lunes");
    linea = System.console().readLine();
    int lunes;
    lunes = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca las horas trabajadas el Martes");
    linea = System.console().readLine();
    int martes;
    martes = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca las horas trabajadas el Miércoles");
    linea = System.console().readLine();
    int miercoles;
    miercoles = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca las horas trabajadas el Jueves");
    linea = System.console().readLine();
    int jueves;
    jueves = Integer.parseInt(linea);
    System.out.println("Por favor, introduzca las horas trabajadas el Viernes");
    linea = System.console().readLine();
    int viernes;
    viernes = Integer.parseInt(linea);
    int total;
    total = (lunes + martes + miercoles + jueves + viernes) * 12;
    System.out.println("Te corresponden: " + total + " euros.");
  }
}
