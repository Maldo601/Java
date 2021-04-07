package Q_ArgumentsMain;

public class B_ConversorBase {
    static long passaBinDec (String x){
        int n = x.length()-1;
        if ( n == 0)
            return Integer.parseInt(x);
        return 2 * passaBinDec(x.substring(0,n)) + Integer.parseInt(x.substring(n));
    }
    public static void main (String [] args){
        if ( args.length == 0 )
            System.out.println("Errors."); 
      
    }
}