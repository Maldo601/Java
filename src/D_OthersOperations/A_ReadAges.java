package D_OthersOperations;

import java.util.Scanner;

public class A_ReadAges {

    public static Scanner lectage;
    public static void main (String[] args) {

        lectage = new Scanner(System.in);
        System.out.println("\n\tBenvingut a la lectora d'edat.");
        System.out.print("\n\t\033[32mIntrodueix edat: \033[37m");
        // nextByte permet la lectura de dades entrades amb format enter fins a 128.
        byte edat = lectage.nextByte();
        System.out.println("\n\tLa teva edat és: " + edat + " anys.\n" );
    }
}
/*_Maldo_*/
