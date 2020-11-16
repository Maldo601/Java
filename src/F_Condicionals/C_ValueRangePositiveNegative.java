package F_Condicionals;

import java.util.Scanner;

public class C_ValueRangePositiveNegative {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.print("Introdueix un numero: ");
        // Variable. 
        int n = lect.nextInt();
        // Output Condicional Ternari.
        System.out.println(
           (n < -100 || n > 100 ? "Fora de rang" : "El numero esta al rang") + "\n" +
           // -1 = Negative, 1 = Positive, 0 = 0, Other = NaN
           Math.signum(n)           
        );
    }
}
// _ M A L D O _ //
