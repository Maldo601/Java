package S_GestioFitxers;

public class A_NumeroPrimo {
    static boolean esPrimo( long x ){
        for (int i = 1; i < x; i++){
            if ( x % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        // System.out.println(esPrimo(x))
    }
}
