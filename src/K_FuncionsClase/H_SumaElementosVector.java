package K_FuncionsClase;

public class H_SumaElementosVector {
    public static long sum(int[]v, int numEl){
        long suma = 0;
        for (int x = 0; x < numEl; x++)
            suma+=v[x];
        return suma;
    }
    public static void main (String[] args){
        int uve[] = {1,2,3,4,5,6,7,8,9};
        
        System.out.println(sum(uve, 9)); // Tres primeros
    }
}
