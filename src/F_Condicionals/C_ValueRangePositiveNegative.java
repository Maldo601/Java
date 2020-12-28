package F_Condicionals;

import java.util.Scanner;

public class C_ValueRangePositiveNegative {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.print("\n\t\033[32mIntrodueix un numero: \u001B[0m");
        // Variable. 
        int n = lect.nextInt();
        // Output Condicional Ternari.
        System.out.println(
           (n < -100 || n > 100 ? "\t\033[31mFora de rang\u001B[0m" : "\t\033[36mEl numero esta al rang\u001B[0m") + "\n\t" +
           // -1 = Negative, 1 = Positive, 0 = 0, Other = NaN
           Math.signum(n) + "\n"          
        );
    }
}
// _ M A L D O _ //
