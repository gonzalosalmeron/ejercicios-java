package ejercicios_bucles;
/**
 * Muestra los números de 320 al 160
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio5 {
    public static void main(String[] args) {
        int num = 320;
        while(num > 159){
            System.out.println(num);
            num = num - 20;
        }
    }
}