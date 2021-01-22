package F_Condicionals;
import java.util.Scanner;
public class P_MesEspectacleOnlyCond {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Hola quants adults sou?: ");
        int adults = lect.nextInt();
        System.out.println("I quants menors porteu?: ");
        int menors = lect.nextInt();
        if ( menors > adults*2)
            System.out.println("No podeu passar, hi han " + menors + " menors i " +adults+ " adults");
        else 
            System.out.println("Podeu passar, hi han "+menors+" menors i "+adults+ " adults");
    }
}
