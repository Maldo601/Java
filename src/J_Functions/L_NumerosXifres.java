package J_Functions;
import java.util.Scanner;
public class L_NumerosXifres {
    public static Scanner lect;
    static int lenNum (int num){
        String s = Integer.toString(num);
        return s.length();
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int num = lect.nextInt();

        System.out.println("El número conté " + lenNum(num) + " xifres.");
    }
}
