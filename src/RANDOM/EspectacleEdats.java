package RANDOM;
import java.util.Scanner;
public class EspectacleEdats {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        int a,b,c;
        System.out.print("Introdueix la edat 1: ");
        a = lect.nextInt();
        System.out.print("Introdueix la edat 2: ");
        b = lect.nextInt();
        System.out.print("Introdueix la edat 3: ");
        c = lect.nextInt();

        if ( a >= 18 || b >= 18 || c >= 18){
            System.out.println("Es pot accedir a l'espectacle tots plegats.");
            System.out.println("Les edats són: " +a+ " " +b+ " " +c);
        }
        else
            System.out.println ("No es pot accedir a l'espectacle.");
    }
}
