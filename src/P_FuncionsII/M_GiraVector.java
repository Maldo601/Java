package P_FuncionsII;

import java.util.Arrays;

public class M_GiraVector {
    static int[] giraVector(int[] v){
        int aux;
        for (int i = 0; i < v.length/2; i++){
            aux = v[i];
            v[i] = v[v.length-1-i];
            v[v.length-1-i] = aux;
        }
        return v;
    }
    public static void main (String[] args){
        int v[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(giraVector(v)));
    }
}
