package Q_ArgumentsMain;
import java.util.*;
public class A_testMain {
    /* 

    */
    public static void main ( String [] args ) {
        if (args.length == 0)
            System.out.println("\n\tT'has olvidat de passar parametros.");
        else {
            Arrays.sort(args);
            // Bucle for - loop
            for (String arg : args)
               System.out.println(arg);
        }
    }
}
// Maldo
