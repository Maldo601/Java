package D_OthersOperations;

import java.util.Scanner;

public class L_RepartintPeres {
    public static Scanner lectper;
    public static void main (String[] args ) {
        lectper = new Scanner(System.in);
        // Variables.
        String peres;
        int np, ppl;
        System.out.println("\n\t\t\u001B[32mBenvingut a la verduleria municipal."
                          +"\tAvui nomes tenim peres.");

        System.out.print("\n\t\t\u001B[36mQue vols repartir?: \u001B[37m");
            // Demanarem un String per teclat que es reservarà.
            peres = lectper.nextLine();
            // Es convertira tot a minuscula per ser equal al if. 
            peres = peres.toLowerCase();
            // Si introdueix peres, el programa continua, si no, finalitza. 
            if ( peres.equals("peres")) {
                System.out.print("\n\t\t\u001B[36mI quantes en vols per a repartir?: \u001B[37m");
                np = lectper.nextInt();
                System.out.print("\t\t\u001B[36mEntre quantes persones?: \u001B[37m");
                ppl = lectper.nextInt();
                System.out.println("\n\t\t\u001B[35mLoading \u001B[37m. . . \n");

                // Outputs
                System.out.println(
                    "\n\t\t\u001B[33mToquen " + Math.floorDiv(np, ppl) + "\u001B[37m " + peres + " \u001B[33mper persona \n" 
                  + "\n\t\t\u001B[33mSobren " + Math.floorMod(np,ppl) + "\u001B[37m " +peres+ "\u001B[33m\n"
                );
            } else {
                System.out.println("\n\t\t\u001B[31mNo en tenim d'això, adeu.");
        }
    }
}
/*_Maldo_*/

