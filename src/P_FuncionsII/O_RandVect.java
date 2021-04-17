package P_FuncionsII;

import java.util.Arrays;

public class O_RandVect {
    static int [] creaVector (int min, int max, int num){
        int v[] = new int[num];
        // Intercanvi
        int aux;
        if (min > max){
            aux = min;
            min = max;
            max = aux;
        }
        for ( int i = 0; i < num; i++){
            int numP = ((int) (Math.random() * (max - min + 1)) + min);
            v[i] = numP;
        }
        return v;
    }
    public static void main (String [] args){
        System.out.println(Arrays.toString(creaVector(9, 1, 30)));
    }
}
