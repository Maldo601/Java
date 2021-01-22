package RANDOM;
public class dosnuevefor {
    public static void main (String[] args){
        for (int n=2; n<=9; n+=7){
            for (int m=2; m<=9; m+=7){
                for (int i=2; i<=9; i+=7){
                    for (int o=2; o<=9; o+=7)
                    // Metodo lento. 
                    /*      if( (n==2 || n==9) && 
                              (m==2 || m==9) &&
                              (i==2 || i==9) &&
                              (o==2 || o==9) )
                    */
                            System.out.println(n+""+m+""+i+""+o);
                }
            }
        }
    }
}

