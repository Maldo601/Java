package D_OthersOperations;

import java.util.Scanner;

public class G_EDivDif {
    public static Scanner lectDiv;
    public static void main (String[] args) {

        lectDiv = new Scanner (System.in);
        System.out.print("\n\tIntrodueix un Dividend: ");
        double D = lectDiv.nextDouble();
        System.out.print("\n\tIntrodueix un Divisor: ");
        double d = lectDiv.nextDouble();
        //Output
        System.out.println("\n\t" + D + "/" + d + "= " + D / d );
    }
}
/*_Maldo_*/  