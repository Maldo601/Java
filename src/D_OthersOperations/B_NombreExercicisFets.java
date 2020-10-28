package D_OthersOperations;

import java.util.Scanner;

public class B_NombreExercicisFets {
    public static Scanner lectexer;
    public static void main(String[] args) {
        
        lectexer = new Scanner(System.in);
        System.out.print("\n\tHola, quants d'exercicis has fet? : ");
        // Variable recolectora d'enter entrat per terminal.
        int N = lectexer.nextInt();
        // Output. 
        System.out.println("\n\tHe fet " + N + " exercicis. \n" );
    }
}
/*_Maldo_*/



