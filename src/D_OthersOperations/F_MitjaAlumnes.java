package D_OthersOperations;

import java.util.Scanner;

public class F_MitjaAlumnes {
    public static Scanner lectmig;
    public static void main (String[] args) {

       lectmig = new Scanner (System.in);

       System.out.println("\n\tBenvingut a la calculadora de mitjanes."
                            // Break de codi aplicant operador i concatenant
                            + "\n\tIntrodiu les notes dels alumnes. ");
       // LA variable única i necessaria. 
       int mitja;

       System.out.print("\n\t\033[32mAlumne 1: \033[37m");
              mitja = lectmig.nextInt();
       System.out.print("\t\033[32mAlumne 2: \033[37m");
              mitja = mitja + lectmig.nextInt();
       System.out.print("\t\033[32mAlumne 3: \033[37m");
              mitja = mitja + lectmig.nextInt();
       System.out.print("\t\033[32mAlumne 4: \033[37m");
              mitja = mitja + lectmig.nextInt();
              
              mitja = mitja / 4;
       // Output        
       System.out.println("\n\tLa mitja dels alumnes és:  \t\t\t\033[33m" + mitja + "\n");
       if (mitja == 10 ) {
           System.out.println("\tEls alumnes han assolit tots la excelencia"); 
       } else if (mitja <= 4) {
           System.out.println("\tLa mitjana es considera suspesa. \n");
       }/*_Maldo_*/
    }
}

