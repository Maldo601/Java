package C_OperacionesLecturaEscritura;

import java.util.Scanner;

public class E_CharacterCount {
    public static Scanner lectchar;
    public static void main(String[] args) {

        lectchar = new Scanner(System.in);
        System.out.println("\n\tBenvingut a la recomptadora de caràcters");
        System.out.print("\n\t\033[32mIntrodueix algo: \033[37m");
        String intxt = lectchar.nextLine();
        // Crida a la cadena per mesurar-la i retornar un valor del tipus integer. 
        int n = intxt.length();       
        // Output
        System.out.println("\tNº caràcters: " + n + "\n");
    }    
}
/*_Maldo_*/