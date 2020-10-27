/**
* 
*Calcular salario semanal
* 
*
* @author Gonzalo Salmerón Robles
*/
public class ejercicio04{
  public static void main(String[] args){
    final int eurosHora = 12;
    final int eurosHorasExtra = 16;
    int sueldoTotal;
    int horasExtra;
    System.out.print("Introduce las horas trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <= 40 && horasTrabajadas >= 0) {
      sueldoTotal = horasTrabajadas * eurosHora;
      System.out.printf("El sueldo para %d horas de trabajo es de %d euros", horasTrabajadas, sueldoTotal);
    }
    else if (horasTrabajadas > 40) {
      horasExtra = horasTrabajadas - 40;
      sueldoTotal = (40 * eurosHora) + (horasExtra * eurosHorasExtra);
      System.out.printf("El sueldo para %d horas de trabajo es de %d euros", horasTrabajadas, sueldoTotal);
    }
  }
}
