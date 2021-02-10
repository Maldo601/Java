package K_FuncionsClase;
    
public class provafuncions {
    static void major(int a, int b){
        if (primerMajor(a, b))
        System.out.println("El valor mayor és: " + a);
        else 
        System.out.println("El valor mayor és: " + b);
    }
    static boolean primerMajor (int a, int b){
        return a>b;
    }
    public static void main(String[] args){
        major(10,5);
        major(65,4);
    }
}

// funcio a la que li passarem dos valors INT i retorna el major. 
// Tres valores. 
// Cuatro valores. 
