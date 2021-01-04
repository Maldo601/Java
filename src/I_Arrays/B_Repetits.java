package I_Arrays;
import java.util.Scanner;
import java.util.Random;
public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner(System.in);
        int n = (int) 10e6;
        int k = n;
        int counter = 0;
        int[] resultado = new int[n];
        int[] numeros = new int[n];
        Random rnd = new Random();
        int res;
        // Loop 
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(k);
            resultado[i] = numeros[res];
        }
        for (int i = 0; i < 1000000; i++) {
            System.out.println(resultado[i]);
            counter++;
        }
        System.out.println("S'han imprimit " + counter + " de resultats.");
    }
}