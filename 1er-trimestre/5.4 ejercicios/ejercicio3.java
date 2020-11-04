package ejercicios_bucles;
/**
 * Multiplos de 5 hasta 100
 * @author Gonzalo Salmerón Robles
 */
public class ejercicio3 {
    public static void main(String[] args) {
            int i = 0;
            int multiplos = 0;
        do{
            System.out.println(multiplos);
            i++;
            multiplos = i * 5;
        } while(i < 21);
    }
}