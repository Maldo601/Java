package F_Condicionals;
import java.util.Scanner;
public class E_AbsoluteNum {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variables
        System.out.print("\n\t\033[32mIntrodueix el primer numero: \u001B[0m");
        int x = lect.nextInt();  
        System.out.print("\t\033[32mIntrodueix el segon numero: \u001B[0m");
        int y = lect.nextInt();
        // Condicionals
        if ( Math.abs(x) > Math.abs(y) )
            System.out.println( "\n\t\033[33m" + x + " És mes gran, absolutament, que " + y + "\n");
            else if ( Math.abs(x) < Math.abs(y) )
            System.out.println( "\n\t\033[33m"+ y + " És més gran, absolutament, que " + x + "\n");
        else
        System.out.println("\n\t\033[33mEls números son iguals en termes absoluts. \n");
        // Si no ens demanés retornar la variable amb signe i nomes valor absolut...
       // Math.max(Math.abs(x),Math.abs(y));
    }
}
// MALDO // 