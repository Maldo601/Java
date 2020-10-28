package D_OthersOperations;

import java.util.Scanner;

public class D_LongsProducteSuma {
    public static Scanner lectlongs;
    public static void main (String[] args) {
        lectlongs = new Scanner(System.in);
        System.out.println("\n\tBenvingut a la màquina que opera i t'ho ensenya");
        // Declarem dos variables que reservaran un input terminal. 
        System.out.print("\n\tIntrodueix el primer nombre: ");
        long a = lectlongs.nextLong();
        System.out.print("\tIntrodueix el segon nombre: ");
        long b = lectlongs.nextLong();
        
        // Output 
        System.out.println("\n\t" + (a + " * " + b + " = " +  a*b + "\n\t" + a + " + " + b + " = " + (a+b)) + "\n");
    }
}
/*_Maldo_*/
