package RANDOM;
public class DosNueve {
    // Totes les combinacions possibles de 2 i 9's.
    public static void main (String[] args){
        String x;
        for (int n=2229; n<=9992; n++){
             x = Integer.toString(n);
             if (!x.contains("1") && !x.contains("3") &&
                 !x.contains("4") && !x.contains("5") &&
                 !x.contains("6") && !x.contains("7") &&
                 !x.contains("8") && !x.contains("0"))
                System.out.println(x); 
        }
    }
}
           
