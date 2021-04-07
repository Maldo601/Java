package P_FuncionsII;

import java.util.Arrays;

public class J_intVector {
    static int min ( int v[] ){
        int value = 0;
        int aux [] = Arrays.copyOf(v, v.length);
        Arrays.sort(aux);
        return value += aux[0];
    }
    static long min ( long d[] ){
        long value = 0;
        long aux[] = Arrays.copyOf(d, d.length);
        Arrays.sort(aux);
        return value += aux[0];
    }
    public static void main ( String[] args ){
        int v[] = {99,12,33,123};
        long d[] = {9,12,3,5,55};
        System.out.println(min(v));
        System.out.println(min(d));
    }
}
// Maldo
