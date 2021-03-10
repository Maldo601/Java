package K_FuncionsClase;
public class K_VectorEntersSuma {
    // Exercici I
    static long sum (int[]v){
        
        int resultatSuma = 0;
        for (int i = 0; i < v.length; i++){
            resultatSuma += v[i];
        }
        return resultatSuma;
    }
    // Exercici II 
    static int vegades (int[]v, int x){
        int counter = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] == x)
            counter++;
        }
        return counter;
    }
    // Exercici III
    static boolean estaVector(int[] v, int x){
        for (int i = 0; i < v.length; i++){
            if (v[i] == x)
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        int v[] = {1,2,2,4,5,6,7,8};
        System.out.println(sum(v));
        System.out.println("El numero 2 s'ha repetit: " + vegades(v, 2));
        System.out.println(estaVector(v, 2));
        
    }
}
