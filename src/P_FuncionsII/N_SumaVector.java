package P_FuncionsII;
import java.util.*;
public class N_SumaVector {
    static int [] suma_vectors (int[] v1, int []v2){
        int v[] = new int[v2.length > v1.length ? v2.length : v1.length];
        for (int i = 0; i < v.length; i++){
            if (i < v1.length)
                v[i] = v1[i] + v2[i];
            }
            for (int i = v1.length; i < v2.length; i++)
                v[i] = v2[i];
        return v;
    }
    public static void main (String[] args) {
        int v1[] = {1,2,3};
        int v2[] = {5,5,5,5,5};
        System.out.println(Arrays.toString(suma_vectors(v1,v2)));
    }
}
