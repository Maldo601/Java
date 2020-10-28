package C_OperacionesLecturaEscritura;

import java.util.Scanner;

public class D_DNI_Extract {
    public static Scanner lectDni;
    public static void main (String[] args) {

        lectDni = new Scanner(System.in);
        // Benvinguda al programa i requeriment de dades.
        System.out.println("\n\tBenvingut a l'extractora de números i lletra del DNI");
        System.out.print("\n\t\033[32mIntrodueix el teu DNI: \033[37m");
        // Lector inpunt DNI.
        String dni = lectDni.nextLine();              
        // Selector numèric.
        String num = dni.substring(0,8);
        // Selector de caràcter.
        char letter = dni.charAt(8);
        // Output
        System.out.println("\n\tEls digits del teu DNI són: \033[33m" + num);
        System.out.println("\t\033[37mLa lletra del teu DNI correspon a la: \033[33m" + letter + "\n");
    }
}
/*_Maldo_*/
