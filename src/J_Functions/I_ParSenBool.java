package J_Functions;
import java.util.Scanner;
public class I_ParSenBool {
    public static Scanner lect;
    static boolean parSen(int a){
        return (a % 2 == 0);
    }
    static boolean parSen(long a){
        return (a % 2 == 0);
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int x = lect.nextInt();
        // Output
        if (parSen(x) == true)
        System.out.print("El número és Parell");
        else 
        System.out.println("El número és Senar");
    }
}
// Joan Marc Maldonado
