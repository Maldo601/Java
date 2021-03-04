package K_FuncionsClase;
import java.util.Scanner;
public class I_AElevat {
    static Scanner lect;
    // Positius
    static double eleva (int base, int expo){
        if (expo < 0)
        return 1.0/eleva(base,-expo);
        if (expo == 0)
        return 1.0;
        return base * eleva(base, expo-1);
    }
    // Out 
    public static void main(String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix la base: ");
        int x = lect.nextInt();
        System.out.print("Introdueix exponent: ");
        int y = lect.nextInt();
        System.out.println(eleva(x,y));
        
    }
}
// Joan Marc Maldonado Negre 
