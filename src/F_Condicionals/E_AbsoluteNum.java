package F_Condicionals;
import java.util.Scanner;
public class E_AbsoluteNum {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variables
        System.out.print("Introdueix el primer numero.");
        int x = lect.nextInt();  
        System.out.print("Introdueix el segon numero.");
        int y = lect.nextInt();
        // Condicionals
        if ( Math.abs(x) > Math.abs(y) )
            System.out.println( x + " És mes gran, absolutament, que " + y);
            else if ( Math.abs(x) < Math.abs(y) )
            System.out.println( y + " És més gran, absolutament, que " + x);
        else
        System.out.println("Els números son iguals en termes absoluts. ");
        // Si no ens demanés retornar la variable amb signe i nomes valor absolut...
       // Math.max(Math.abs(x),Math.abs(y));
    }
}
// MALDO // 