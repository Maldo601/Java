package RANDOM;
import java.util.Scanner;
public class EspectacleCincAdults {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        // Variables
        int a,b,c,d,e;
        System.out.print("Introdueix la edat 1: ");
        a = lect.nextInt();
        System.out.print("Introdueix la edat 2: ");
        b = lect.nextInt();
        System.out.print("Introdueix la edat 3: ");
        c = lect.nextInt();
        System.out.print("Introdueix la edat 4: ");
        d = lect.nextInt();
        System.out.print("Introdueix la edat 5: ");
        e = lect.nextInt();
        int x;
        x = 0;
        // Condicionals 
        if (a >= 18){
            x = a;
        }
        if (b >= 18){
            x = x+b;
        }
        if (c >= 18){
            x = x+c;
        }
        if (d >= 18){
            x = x+d;
        }
        if (e >= 18){
            x = x+e;
        }
        if ( x >= 36)
            System.out.println("Podeu passar hi han dos adults");
        else
            System.out.println("No es pot passar, no hi han dos adults");       
    }
}
