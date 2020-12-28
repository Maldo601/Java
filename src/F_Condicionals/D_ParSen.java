package F_Condicionals;

import java.util.Scanner;

public class D_ParSen {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.print("\n\t\033[32mIntrodueix un valor: \u001B[0m");
        int n = lect.nextInt();
        // Output Condicional
        /* Mètode innecessari: 
           if (n%2==0)
                sys ...
           else ( o else if (n%2==1 ) )
                sys...                    */
        // Òptim.
        System.out.println(
            (n % 2 == 0 ? "\t\033[32mPar\n" : "\t\033[31mImpar\n")
        );
    }
}
// M A L D O // 
