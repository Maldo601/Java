package L_Opcionals;
import java.util.Scanner;
public class ImprimirTab {
    public static Scanner lect;
    static String impr (String g){
        for (int x = 0; x < 8; x++){
            System.out.println("-------------------------");
            for (int n = 0; n < 1; n++){
            System.out.println(":  :  :  :  :  :  :  :  :");
            }
        }
        System.out.println("-------------------------");
        return g;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);


        System.out.println(impr(""));
    }
}
// Joan Marc Maldonado Negre 
