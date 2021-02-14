package J_Functions;
import java.util.Scanner;
public class J_Dni {
    static Scanner lect;
    static String nif(int dni) {
        char let = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
        return dni + " " + Character.toString(let);
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tIntrodueix Digits del DNI: ");
        int nif = lect.nextInt();
        System.out.println("\t" + nif(nif));
    }
}
// Joan Marc Maldonado