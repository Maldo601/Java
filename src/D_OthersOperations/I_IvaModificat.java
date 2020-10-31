package D_OthersOperations;

import java.util.Scanner;

public class I_IvaModificat {
    public static Scanner ivamod;
    public static void main (String[] args ) {
        ivamod = new Scanner(System.in);

        System.out.print("\n\t\u001B[36mIntroduiex un % d'IVA: \u001B[37m");
        // Usaré una constant llegida per scanner, potser si el programa evolucionés no interessaria que es 
        // modifiques per cualsevol cosa. 
        final Double IVA = ivamod.nextDouble();
        if (IVA < 21 ) {
            System.out.println("\t\u001B[31mA Hacienda no li agrada aquest IVA.\u001B[37m"); 
        }
        System.out.print("\t\u001B[33mHeu introduit un " + IVA + " % d'IVA\u001B[37m");
        System.out.print("\n\t\u001B[36mSiusplau, entreu un preu: \u001B[37m");
        // Demanarem el preu a l'usuari almacenat en una variable. 
        Double preu;
            preu = ivamod.nextDouble();
        Double calc = (preu * IVA)/100;
        System.out.print("\n\t  \u001B[34mEl preu sense IVA és: \u001B[37m" + preu + " €");
        System.out.print("\n\t  \u001B[34mS'aplica: \u001B[37m" + (double)Math.round((calc) * 100d)/100d + " € \u001B[34md'IVA al preu.\u001B[37m");
            preu = preu + calc;
        System.out.println("\n\t  \u001B[34mEl preu total són: \u001B[37m" + (double)Math.round((preu) * 100d)/100d + " €\n");
    }
}
/*_Maldo_*/
