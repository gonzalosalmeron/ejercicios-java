package ejercicios_bucles;
/**
 * Muestra los números de 320 al 160
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int num = 320;
        do{
            System.out.println(num);
            num = num - 20;
        }while(num > 159);
    }
}