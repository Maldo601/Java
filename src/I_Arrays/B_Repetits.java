package I_Arrays;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.Random;
/*
    * Joan Marc Maldonado
    * - El codi conté prints descomentables per
    * - executar proves o llistar.
*/
public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner(System.in);
        // Variables, Arrays i counters.
        int counter = 0;
        int v[] = new int[(int) 1000]; // Long. resultats.
        System.out.println("Volcant resultats ...");
        // Main Loop
            for (int i=0; i < v.length; i++)
            {
                v[i] = (int) (Math.random() * (int) (10e6-1)+1);    
                counter++;
            }
            // Ordenació ascendent.
            Arrays.sort(v);
            System.out.print("Vols llistar els valors ordenats? (Y/N): ");
            String lec = lect.nextLine();
            if (lec.equals("Y"))
            {
                // Bucle Print
                for (int i=0; i < v.length; i++)
                {
                System.out.println(v[i]);
                }
                System.out.println("S'han volcat " + counter + " resultats");
            }
            else if (lec.equals("N"))
            //System.out.println(v[Insertar index per veure valor]); 
            System.out.println("S'han volcat " + counter + " resultats");
            else 
            System.out.println("Error. Introdueix Yes (Y) o No (N)");
        // Loop per ordenar l'Array
            
    }
}
