package C_OperacionesLecturaEscritura;

import java.util.Scanner;

public class B_LectoraNoms {

    public static Scanner lect;
    public static void main (String[] args) { 
        // Activació de l'scanner i benvinguda.
        lect = new Scanner(System.in);
        System.out.println("\n\tBenvingut a l'extractora de noms trilinea sense tres variables."
                         // Break de codi aplicant operador i concatenant
                         + "\n\tIntroduiu el vostre nom i cognoms als formularis.");
        // LA variable. 
        String nom;

        System.out.print("\n\t\033[32mNom      -> \033[37m");
               nom = lect.nextLine() + " ";
        System.out.print("\t\033[32mCognom 1 -> \033[37m");
               nom = nom + lect.nextLine() + " ";
        System.out.print("\t\033[32mCognom 2 -> \033[37m");
               nom = nom + lect.nextLine();
        // Output        
        System.out.println("\n\tEl teu nom complet és: \t\t\t\033[33m"+nom+"\n");
    }
}
/*_Maldo_*/