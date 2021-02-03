package J_Functions;
import java.util.Scanner;
public class B_NomPersonaNorm {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("\nIntrodueix el teu nom en minúscula: ");
        String nom = lect.nextLine();
        System.out.print("Normalitzat: " + norm(nom));
    } 
    static String norm (String nom){
        return nom.substring(0,1).toUpperCase() + nom.substring(1);

    }
}
// M A L D O // 