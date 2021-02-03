package J_Functions;
import java.util.Scanner;
public class A_Inici{
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix una cadena de text: ");
        String cad = lect.nextLine();
        System.out.println("La cadena conté " + len(cad) + " caràcters.");
    }
    static int len (String cad){
        return cad.length();
    }
}
// M A L D O // 

