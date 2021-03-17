package N_Recursivitat;

public class A_DNI {
    
    static long fact( int n ){
        // Retorna el factorial de "n"
        if(n < 2)
        return 1;
        return n * fact(n-1);
    }
}
