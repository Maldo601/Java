package H_Bucles;
import java.util.Scanner;
public class H_GOnlyInt {
    public static Scanner lect;
    private static boolean isDigit(String d) {
        return d.matches("[0-9]*");
    }
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        String d;
        do {
            System.out.print("Introdueix els dies treballats: ");
            d = lect.nextLine();
            System.out.println("Has treballat " + d + " dies.");
        }while(!isDigit(d) || Integer.parseInt(d) > 31);    
    }
    
}
