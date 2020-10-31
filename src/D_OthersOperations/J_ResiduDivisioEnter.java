package D_OthersOperations;

import java.util.Scanner;

public class J_ResiduDivisioEnter {
    public static Scanner lecdiven;
    public static void main (String[] args ) {
        lecdiven = new Scanner(System.in);
        // Mètode I
        // Almacén del residu unicament. 
        int r;
        System.out.print("\t\u001B[36mIntrodueix el numero a dividir: \u001B[37m");
            r = lecdiven.nextInt();
        System.out.print("\t\u001B[36mIntrodueix el numero per el que vols dividir-lo: \u001B[37m");
            r = r % lecdiven.nextInt();
        // Mètode II 
        int D,d;
        System.out.print("\n\t\u001B[36mIntrodueix el numero a dividir: \u001B[37m");
            D = lecdiven.nextInt();
        System.out.print("\t\u001B[36mIntrodueix el numero per el que vols dividir-lo: \u001B[37m");
            d = lecdiven.nextInt();

        // Output I
        System.out.println("\n\t\u001B[33mResidu I: \u001B[37m" + r);
        // Output II
        System.out.println("\t\u001B[33mResidu II: \u001B[37m" + Math.floorMod(D, d) + "\n");
    }
}
/*_Maldo_*/