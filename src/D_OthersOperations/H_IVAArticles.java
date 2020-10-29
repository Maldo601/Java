package D_OthersOperations;

import java.util.Scanner;

public class H_IVAArticles {
    public static Scanner sciva;
    public static void main (String[] args) {
        sciva = new Scanner(System.in);

        // Constante para declarar el IVA fijo.                        
        final Double IVA = 1.21;
        // Variable on es reserva el preu dels articles. 
        Double art;
        
        System.out.print("\n\tIntrodueix el preu de l'article: ");
            art = sciva.nextDouble();
        Double artnoiva = art/IVA;
        
                                                                                                                      
        // OUTPUTS 
        
        System.out.println("\n\tEl preu de l'article introduit amb IVA és: " + art + "€");
        System.out.println("\n\tEl preu introduit sense iva és: " + (double)Math.round((artnoiva) * 100d) / 100d + "€");
        System.out.println("\n\tL'IVA és de: " + (double)Math.round((art-artnoiva) * 100d) / 100d + "€\n");
    }
}
