package D_OthersOperations;

import java.util.Scanner;

public class E_LongProducteDiv {
    public static Scanner lectDiv;
    public static void main (String[] args) {

        lectDiv = new Scanner (System.in);

        System.out.println("\n\tBenvingut a la màquina que retorna Productes i Residus");

        // Declarem dos variables que reservaran un input terminal. 

        System.out.print("\n\tIntrodueix el primer nombre: ");
        long a = lectDiv.nextLong();

        System.out.print("\tIntrodueix el segon nombre: ");
        long b = lectDiv.nextLong();
        
        // Output 
        System.out.print("\n\tValor Producte: " + Math.floorDiv(a, b) +  "\n"); // Retorna Producte
        System.out.println("\n\tValor Residu: " + Math.floorMod(a, b) +  "\n"); // Retorna Residu
    }
}
/*_Maldo_*/  

