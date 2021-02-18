package K_FuncionsClase;

public class H_SumaElementosVector {
    public static long sum(int[]v){
        int suma = 0;
        for (int x = 0; x < 2 ; x++){
            suma+=v[x];
        }
        return suma;
    }
    public static void main (String[] args){
        int v[] = {5,10,20};
        System.out.println(sum(v));
    }
}
// summ le pasamos los primeros x sumados. 