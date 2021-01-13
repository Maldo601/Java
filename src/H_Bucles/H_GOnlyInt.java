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
            if (!isDigit(d))
            System.out.println("ERROR, introdueix un número.");
            else if (Integer.parseInt(d) < 0 || Integer.parseInt(d) > 31)
            System.out.println("T'he demanat els dies treballats en un mes. " +
                               "\nLa quantitat introduida no es correspon als dies que es contenen en un mes");
            else 
            System.out.println("Has treballat " + d + " dies");
        }while(!isDigit(d) || Integer.parseInt(d) > 31);    
    }
}
// M A L D O // 




